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
package com.financial.swift.io;

import com.financial.ProwideException;
import com.financial.swift.io.parser.SwiftParser;
import com.financial.swift.io.parser.XMLParser;
import com.financial.swift.io.writer.FINWriterVisitor;
import com.financial.swift.io.writer.SwiftWriter;
import com.financial.swift.io.writer.XMLWriterVisitor;
import com.financial.swift.model.SwiftMessage;
import org.apache.commons.lang3.Validate;

import java.io.*;


/**
 * This interface provides a general conversion service between three different formats:
 * <ul>
 * 	<li><b>FIN</b>: SWIFT message format as used by SWIFTNet (ISO 15022 compliance).</li>
 *  <li><b>XML</b>: WIFE's XML representation of SWIFT messages.</li>
 *  <li><b>SwiftMessage</b>: WIFE's java object model of SWIFT messages.</li>
 * </ul>
 * <p>This class may be used as a serializer.
 * <p>All methods in this class are <b>threadsafe</b>.
 */
public class ConversionService implements IConversionService {
	private static final transient java.util.logging.Logger log = java.util.logging.Logger.getLogger(ConversionService.class.getName());

	/**
	 * Given a SwiftMessage object returns a String containing its SWIFT message representation.
	 *
	 * @see com.financial.swift.io.IConversionService#getFIN(com.financial.swift.model.SwiftMessage)
	 */
	public String getFIN(final SwiftMessage msg) {
		Validate.notNull(msg);
		final StringWriter writer = new StringWriter();
		SwiftWriter.writeMessage(msg, writer);
		final String fin = writer.getBuffer().toString();
		return ensureEols(fin);
	}

	/**
	 * Make sure all EOLs are swift compatible
	 * @return an empty or incomplete string if an error occurs
	 */
	private static String ensureEols(final String result) {
		final StringBuilder buf = new StringBuilder();
		try {
			final BufferedReader r = new BufferedReader(new StringReader(result));
			String l;
			while ((l=r.readLine()) != null) {
				buf.append(l).append(FINWriterVisitor.SWIFT_EOL);
			}
		} catch (final Exception e) {
			log.severe("Error in EOL correction: "+e);
		}
		if (buf.length() > 0) {
			//remove the last EOL inserted
			return buf.substring(0, buf.length()-FINWriterVisitor.SWIFT_EOL.length());
		} else {
			return "";
		}
	}

	/**
	 * Given a String containing a message in its Wife XML internal representation, returns a String
	 * containing its SWIFT message representation.
	 *
	 * @see com.financial.swift.io.IConversionService#getFIN(java.lang.String)
	 */
	public String getFIN(final String xml) {
		Validate.notNull(xml);
		final SwiftMessage msg = getMessageFromXML(xml);
		if (msg == null) {
			throw new ProwideException("parsed SwiftMessage from XML is null");
		}
		return getFIN(msg);
	}

	/**
	 * Given a SwiftMessage objects returns a String containing WIFE internal XML representation of the message.
	 *
	 * @see com.financial.swift.io.IConversionService#getXml(com.financial.swift.model.SwiftMessage)
	 */
	public String getXml(final SwiftMessage msg) {
		return getXml(msg, false);
	}
	
	/**
	 * Given a SwiftMessage objects returns a String containing WIFE internal XML representation of the message.
	 * @since 7.6
	 */
	public String getXml(final SwiftMessage msg, final boolean useField) {
		Validate.notNull(msg);
		final StringWriter w = new StringWriter();
		msg.visit(new XMLWriterVisitor(w, useField));
		return w.getBuffer().toString();
	}

	/**
	 * Given a Swift message String returns a String containing WIFE internal XML representation of the message.
	 *
	 * @see com.financial.swift.io.IConversionService#getXml(java.lang.String)
	 */
	public String getXml(final String fin) {
		return getXml(fin, false);
	}
	
	/**
	 * Given a Swift message String returns a String containing WIFE internal XML representation of the message, use field (true) or tag (false) depending on the value of useField 
	 *
	 * @see #getXml(String)
	 * @since 7.6
	 */
	public String getXml(final String fin, final boolean useField) {
		Validate.notNull(fin);
		final SwiftMessage msg = this.getMessageFromFIN(fin);
		return getXml(msg, useField);
	}

	/**
	 * Given a Swift message String returns a SwiftMessage object.
	 *
	 * @see com.financial.swift.io.IConversionService#getMessageFromFIN(java.lang.String)
	 */
	public SwiftMessage getMessageFromFIN(final String fin) {
		Validate.notNull(fin);
		final SwiftParser p = new SwiftParser(new ByteArrayInputStream(fin.getBytes()));
		try {
			return p.message();
		} catch (final IOException e) {
			throw new ProwideException(e+" during parse of message");
		}
	}

	/**
	 * Given a String containing a message in its WIFE internal XML representation, returns a SwiftMessage object.
	 *
	 * @see com.financial.swift.io.IConversionService#getMessageFromXML(java.lang.String)
	 */
	public SwiftMessage getMessageFromXML(final String xml) {
		return new XMLParser().parse(xml);
	}
	
}
