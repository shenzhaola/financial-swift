/*
 * Copyright 2006-2018 Prowide
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.financial.swift.model.mx;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.financial.JsonSerializable;
import com.financial.swift.Resolver;
import com.financial.swift.io.parser.MxParser;
import com.financial.swift.model.AbstractMessage;
import com.financial.swift.model.MessageStandardType;
import com.financial.swift.model.MxId;
import com.financial.swift.model.mt.AbstractMT;
import com.financial.swift.utils.Lib;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Base class for specific MX messages.<br>
 *
 * IMPORTANT: An MX message is conformed by a set of optional headers 
 * and a message payload or document with the actual specific MX message. 
 * The name of the envelope element that binds a Header to the message 
 * to which it applies is <b>implementation/network specific</b> and not
 * part of the scope of this model. 
 *
 * <p>This class provides the base container model for MX messages including
 * an attribute for the header. Further it supports both versions for the
 * header; the SWIFT Application Header (legacy) and the ISO Business
 * Application Header.
 *
 * <p>Subclasses in Prowide Integrator SDK implement the Document portion
 * of each specific MX message type.
 *
 * <p>Serialization of this model into XML text can be done for the with or without
 * the header portion. When the header is set and included into the serialization, 
 * the container root element must be provided.
 *
 * @since 7.6
 * @see AbstractMT
 */
public abstract class AbstractMX extends AbstractMessage implements IDocument, JsonSerializable {
	private static final transient Logger log = Logger.getLogger(AbstractMX.class.getName());

	protected AbstractMX() {
		super(MessageStandardType.MX);
		// prevent construction
	}

	protected AbstractMX(final BusinessHeader businessHeader) {
		super(MessageStandardType.MX);
		this.businessHeader = businessHeader;
	}

	/**
	 * Header portion of the message payload, common to all specific MX subclasses.
	 * This information is required before opening the actual message to process the content properly.
	 * @since 7.7
	 */
	private BusinessHeader businessHeader;

	// TODO message is MT parse
	protected static String message(final String namespace, final AbstractMX obj, @SuppressWarnings("rawtypes") final Class[]classes, final String prefix, boolean includeXMLDeclaration) {
		return Resolver.mxWrite().message(namespace, obj, classes, prefix, includeXMLDeclaration);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected static AbstractMX read(final Class<? extends AbstractMX> targetClass, final String xml, final Class[] classes) {
		return Resolver.mxRead().read(targetClass, xml, classes);
	}

	/**
	 * Get the classes associated with this message
	 * @since 7.7
	 */
	@SuppressWarnings("rawtypes")
	public abstract Class[] getClasses();

	/**
	 * Get the XML namespace of the message
	 * @since 7.7
	 */
	public abstract String getNamespace();

	/**
	 * get the Alphabetic code in four positions (fixed length) identifying the Business Process
	 * @return the business process of the implementing class
	 * @since 7.7
	 */
	public abstract String getBusinessProcess();

	/**
	 * Get the code identifying the Message Functionality
	 * @return the set functionality or null if not set
	 * @since 7.7
	 */
	public abstract int getFunctionality();

	/**
	 * Get the Message variant
	 * @return the set variant or null if not set
	 * @since 7.7
	 */
	public abstract int getVariant();

	/**
	 * Get the message version
	 * @return the set vesion or null if not set
	 * @since 7.7
	 */
	public abstract int getVersion();

	/**
	 * Get this message document as an XML string (headers not included).
	 * The XML will include the XML declaration, the corresponding
	 * namespace and a "Doc" prefix for the namespace.
	 * 
	 * @see #message(String, boolean)
	 * @since 7.7
	 */
	public String message() {
		return message(getNamespace(), this, getClasses(), "Doc", true);
	}
	
	/**
	 * Get this message as an XML string.
	 * <br> 
	 * If the business header is set, the created XML will include
	 * both the header and the document elements, under a default 
	 * root element.
	 * <br>
	 * If the header is not present, the created XMl will only include
	 * the document.
	 * <br>
	 * Both header and document are generated with namespace declaration
	 * and default prefixes.
	 * <br>
	 * IMPORTANT: The name of the envelope element that binds a Header to 
	 * the message to which it applies is implementation/network specific. 
	 * The header root element ‘AppHdr’ and the ISO 20022 MessageDefinition 
	 * root element ‘Document’ must always be sibling elements in any XML 
	 * document, with the AppHdr element preceding the Document element.
	 * <br>
	 * 
	 * @param rootElement optional specification of the root element
	 * @return created XML
	 * @since 7.8
	 */
	public String message(final String rootElement, boolean includeXMLDeclaration) {
		StringBuilder xml = new StringBuilder();
		if (includeXMLDeclaration) {
			xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		}
		final String header = header("h", false);
		if (header != null) {
			xml.append("<" + rootElement + ">\n");
			xml.append(header+"\n");
		}
		xml.append(document("Doc", false)+"\n");
		if (header != null) {
			xml.append("</" + rootElement + ">");
		}
		return xml.toString();
	}
	
	/**
	 * Same as {@link #message(String)} with includeXMLDeclaration set to true
	 * @since 7.8
	 */
	public String message(final String rootElement) {
		return message(rootElement, true);
	}
	
	/**
	 * Get this message business header as an XML string.
	 * <br>
	 * The XML will not include the XML declaration, and will
	 * include de namespace as default (without prefix).
	 * 
	 * @return the serialized header or null if header is not set
	 * @since 7.8
	 * @see #header(String, boolean)
	 */
	public String header() {
		return header(null, false);
	}
	
	/**
	 * Get this message business header as an XML string.
	 * <br>
	 * @param prefix optional prefix for namespace (empty by default)
	 * @param includeXMLDeclaration true to include the XML declaration (false by default)
	 * @return header serialized into XML string or null if neither header version is present
	 * @since 7.8
	 * @see BusinessHeader#xml(String, boolean)
	 */
	public String header(final String prefix, boolean includeXMLDeclaration) {
		if (this.businessHeader != null) {
			return this.businessHeader.xml(prefix, includeXMLDeclaration);
		} else {
			return null;
		}
	}
	
	/**
	 * Get this message document as an XML string.
	 * Same as {@link #message()}
	 * @since 7.8
	 */
	public String document() {
		return message();
	}
	
	/**
	 * Get this message document as an XML string.
	 * <br>
	 * @param prefix optional prefix for namespace (empty by default)
	 * @param includeXMLDeclaration true to include the XML declaration (false by default)
	 * @return document serialized into XML string or null if errors occur during serialization
	 * @since 7.8
	 */
	public String document(final String prefix, boolean includeXMLDeclaration) {
		return message(getNamespace(), this, getClasses(), prefix, includeXMLDeclaration);
	}
	
	/**
	 * Convenience method to get this message XML as javax.xml.transform.Source.
	 * Notice this method will return only the document element of the message (headers not included).
	 * 
	 * @return null if message() returns null or StreamSource in other case
	 * @since 7.7
	 * @see #message()
	 */
	public Source xmlSource() {
		final String xml = message();
		log.fine("XML: "+xml);
		if (xml != null) {
			return new StreamSource(new StringReader(xml));
		}
		return null;
	}


	/**
	 * Writes the message document content into a file in XML format (headers not included).
	 *
	 * @param file a not null file to write, if it does not exists, it will be created
	 * @since 7.7
	 */
	public void write(final File file) throws IOException {
		Validate.notNull(file, "the file to write cannot be null");
		boolean created = file.createNewFile();
		if (created) {
			log.fine("new file created: "+file.getAbsolutePath());
		}
		final FileOutputStream stream = new FileOutputStream(file.getAbsoluteFile());
		write(stream);
		stream.close();
	}

	/**
 	 * Writes the message document content into a file in XML format, encoding content in UTF-8 (headers not included).
	 *
	 * @param stream a non null stream to write
	 * @throws IOException if the stream cannot be written
	 * @since 7.7
	 */
	public void write(final OutputStream stream) throws IOException {
		Validate.notNull(stream, "the stream to write cannot be null");
		stream.write(message().getBytes("UTF-8"));
	}
	
	/**
	 * @since 7.7
	 * @return the business header or null if not set
	 */
	@XmlTransient
	public BusinessHeader getBusinessHeader() {
		return businessHeader;
	}

	/**
	 * @since 7.8
	 * @param businessHeader the header to set
	 */
	public void setBusinessHeader(final BusinessHeader businessHeader) {
		this.businessHeader = businessHeader;
	}

	/**
	 * Returns the MX message identification.<br>
	 * Composed by the business process, functionality, variant and version.
	 *
	 * @return the constructed message id
	 * @since 7.7
	 */
	public MxId getMxId() {
		return new MxId(getBusinessProcess(),
				StringUtils.leftPad(Integer.toString(getFunctionality()), 3, "0"),
				StringUtils.leftPad(Integer.toString(getVariant()), 3, "0"),
				StringUtils.leftPad(Integer.toString(getVersion()), 2, "0"));
	}

	public Element element() {
		final HashMap<String, String> properties = new HashMap<String, String>();
		// it didn't work as expected
		// properties.put(JAXBRIContext.DEFAULT_NAMESPACE_REMAP, namespace);
		try {
			JAXBContext context = JAXBContext.newInstance(getClasses(), properties);

			DOMResult res = new DOMResult();
			context.createMarshaller().marshal(this, res);
			Document doc = (Document) res.getNode();

			return (Element) doc.getFirstChild();
		} catch (Exception e) {
			log.log(Level.WARNING, "Error creating XML Document for MX", e);
			return null;
		}
	}
	
	/**
	 * Parses the XML string containing the Document element of an MX message into a specific instance of MX message object.
	 * <br>
	 * If the string is empty, does not contain an MX document, the message type cannot be 
	 * detected or an error occur reading and parsing the message content; this method returns null.
	 * <br>
	 * The implementation detects the message type and uses reflection to call the
	 * parser in the specific Mx subclass.
	 * <br>
	 * IMPORTANT: For the moment this is supported only in Prowide Integrator.
	 * To parse XML into the generic MxNode structure, or to parse business headers check {@link MxParser}
	 * 
	 * @param xml string a string containing the Document of an MX message in XML format
	 * @param id optional parameter to indicate the specific MX type to create; autodetected from namespace if null.
	 * @return parser message or null if string content could not be parsed into an Mx
	 * 
	 * @since 7.8.4
	 */
	public static AbstractMX parse(final String xml, MxId id) {
		return Resolver.mxRead().read(xml, id);
	}
	
	/**
	 * Parses a file content into a specific instance of Mx. 
	 * <br>
	 * IMPORTANT: For the moment this is supported only in Prowide Integrator.
	 * To parse XML into the generic MxNode structure, or to parse business headers check {@link MxParser}
	 * 
	 * @param file a file containing a swift MX message
 	 * @param id optional parameter to indicate the specific MX type to create; autodetected from namespace if null.
	 * @return parser message or null if file content could not be parsed
	 * @throws IOException if the file cannot be written
	 * @see #parse(String, MxId)
	 * 
	 * @since 7.8.4
	 */
	public static AbstractMX parse(final File file, MxId id) throws IOException {
		return parse(Lib.readFile(file), id);
	}

	/**
	 * Get a JSON representation of this MX	message.
	 * @since 7.10.3
	 */
	@Override
	public String toJson() {
		final Gson gson = new GsonBuilder()
				.registerTypeAdapter(AbstractMX.class, new AbstractMXAdapter())
				.registerTypeAdapter(XMLGregorianCalendar.class, new XMLGregorianCalendarAdapter())
				.setPrettyPrinting()
				.create();
		// we use AbstractMX and not this.getClass() in order to force usage of the adapter
		return gson.toJson(this, AbstractMX.class);
	}

	/**
	 * Used by subclasses to implement JSON deserialization.
	 * @param json a JSON representation of an MX message
	 * @param classOfT the specific MX subclass
	 * @return a specific deserialized MX message object
	 * @since 7.10.3
	 */
	protected static <T> T fromJson(String json, Class<T> classOfT) {
		final Gson gson = new GsonBuilder()
				.registerTypeAdapter(AbstractMX.class, new AbstractMXAdapter())
				.registerTypeAdapter(XMLGregorianCalendar.class, new XMLGregorianCalendarAdapter())
				.create();
		return gson.fromJson(json, classOfT);
	}

	/**
	 * Creates an MX messages from its JSON representation.
	 * @param json a JSON representation of an MX message
	 * @return a specific deserialized MX message object, for example MxPain00100108
	 * @since 7.10.3
	 */
	public static AbstractMX fromJson(String json) {
		final Gson gson = new GsonBuilder()
				.registerTypeAdapter(AbstractMX.class, new AbstractMXAdapter())
				.registerTypeAdapter(XMLGregorianCalendar.class, new XMLGregorianCalendarAdapter())
				.create();
		return gson.fromJson(json, AbstractMX.class);
	}

}
