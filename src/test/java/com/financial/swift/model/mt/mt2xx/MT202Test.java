/*
 * Copyright 2006-2018 Prowide
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.financial.swift.model.mt.mt2xx;

import org.junit.Test;

import com.financial.swift.SchemeConstantsB;
import com.financial.swift.SchemeConstantsN;
import com.financial.swift.io.AbstractReader;
import com.financial.swift.io.PPCReader;
import com.financial.swift.io.PPCWriter;
import com.financial.swift.io.RJEWriter;
import com.financial.swift.model.LogicalTerminalAddress;
import com.financial.swift.model.MessageIOType;
import com.financial.swift.model.MessageStandardType;
import com.financial.swift.model.MtSwiftMessage;
import com.financial.swift.model.MtSwiftMessageTest;
import com.financial.swift.model.SwiftBlock1;
import com.financial.swift.model.SwiftBlock2;
import com.financial.swift.model.SwiftBlock2.MessagePriority;
import com.financial.swift.model.field.Field108;
import com.financial.swift.model.field.Field15A;
import com.financial.swift.model.field.Field15B;
import com.financial.swift.model.field.Field15C;
import com.financial.swift.model.field.Field20;
import com.financial.swift.model.field.Field21;
import com.financial.swift.model.field.Field22C;
import com.financial.swift.model.field.Field30T;
import com.financial.swift.model.field.Field30V;
import com.financial.swift.model.field.Field32B;
import com.financial.swift.model.field.Field33B;
import com.financial.swift.model.field.Field36;
import com.financial.swift.model.field.Field57A;
import com.financial.swift.model.field.Field58A;
import com.financial.swift.model.field.Field72;
import com.financial.swift.model.field.Field82A;
import com.financial.swift.model.field.Field87A;
import com.financial.swift.model.field.Field94A;
import com.financial.swift.model.SwiftBlock2Input;
import com.financial.swift.model.SwiftBlock3;
import com.financial.swift.model.SwiftBlock4;
import com.financial.swift.model.SwiftMessage;
import com.financial.swift.model.SwiftMessageUtils;
import com.financial.swift.model.Tag;
import com.financial.swift.model.mt.AbstractMT;
import com.financial.swift.model.mt.ServiceIdType;
import com.financial.swift.model.mt.mt1xx.MT103;
import com.financial.swift.model.mt.mt3xx.MT300;

import static org.junit.Assert.assertNotNull;

import java.awt.TrayIcon.MessageType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Iterator;

public class MT202Test {

    @Test
    public void test1() {
        MT202 m = new MT202();
        assertNotNull(m.getUETR());
    }

    public static void main(String[] args) throws IOException {

        File file1 = new File("C:\\Users\\shenzl\\Desktop\\a\\1013155 _MT202_20190514141501.b01");
        File file2 = new File("C:\\Users\\shenzl\\Desktop\\a\\1013155 _MT202_20190514141501.b02");
//        // File file = new File("D:\\杭州新利公司\\3.13大连银行\\SWIFT\\swiftin\\20190115\\00073048.abo");
//        File file = new File("D:\\杭州新利公司\\3.13大连银行\\SWIFT\\swiftin\\20190121\\000732621.abo");// 000732621 00073263
//
//        // 报文读取解析
        Iterable<String> swiftIb = new PPCReader(file1);
        for (Iterator iter = swiftIb.iterator(); iter.hasNext();) {
            String str = (String)iter.next();
            SwiftMessage swiftMessage = SwiftMessage.parse(str);
            if (swiftMessage.isAck()) {// 判断是否ACK,更新原交易流水
                swiftMessage = SwiftMessage.parse(swiftMessage.getUnparsedTexts().getText(0));
                String MsgType = swiftMessage.getBlock2().getMessageType();
                System.out.println("报文类型" + MsgType + "==>" );

                // String dealno = "";// swiftMessage.getBlock4().getTagValue(Field20.NAME).substring(2, 9);
                // System.out.println("=====>ACK:" + MsgType + ":");
            } else if (swiftMessage.isNack()) {
                swiftMessage = SwiftMessage.parse(swiftMessage.getUnparsedTexts().getText(0));
                String MsgType = swiftMessage.getBlock2().getMessageType();
                String dealno = swiftMessage.getBlock4().getTagValue(Field20.NAME).substring(2, 9);
                System.out.println("=====>NACK:" + MsgType + ":" + dealno);
            } else if (swiftMessage.isOutgoing()) {
            	swiftMessage.setBlock3(null);
            	String test =swiftMessage.toMT().message().toString();
                 System.out.println(swiftMessage.toXml());
                 RJEWriter ppcWriter = new RJEWriter(file2);
                 ppcWriter.write(test);
                 ppcWriter.flush();
            }
        }
        
        //写报文
//        PPCWriter ppcWriter = new PPCWriter(file1);
//        ppcWriter.write("{1:F01HFBACNSDAXXX0000000000}{2:I202CITIUS33XXXXN}{4:\n" + 
//            ":20:0110134490150332\n" + 
//            ":21:BKCHSG0045HFBASD\n" + 
//            ":32A:161114USD50000000,\n" + 
//            ":57A:BKCHUS33\n" + 
//            ":58A:BKCHSGSG\n" + 
//            "-}");
//        ppcWriter.write("{1:F01HFBACNSDAXXX0000000000}{2:I202CITIUS33XXXXN}{4:\n" + 
//            ":20:0110134490150332\n" + 
//            ":21:BKCHSG0045HFBASD\n" + 
//            ":32A:161114USD50000000,\n" + 
//            ":57A:BKCHUS33\n" + 
//            ":58A:BKCHSGSG\n" + 
//            "-}");
//        ppcWriter.write("{1:F01HFBACNSDAXXX0000000000}{2:I202CITIUS33XXXXN}{4:\n" + 
//            ":20:0110134490150332\n" + 
//            ":21:BKCHSG0045HFBASD\n" + 
//            ":32A:161114USD50000000,\n" + 
//            ":57A:BKCHUS33\n" + 
//            ":58A:BKCHSGSG\n" + 
//            "-}");
//        ppcWriter.flush();

        // SwiftMessage swiftMessage = SwiftMessage.parse(out.toString());
        // 判断是否是ACK NACKswiftMessage.isNack();
        // 获取 返回报文中TEXT域块 swiftMessage.getUnparsedTexts().getText(0)

        // MT202 mt202 =new MT202(out.toString());
        // System.out.println("原始报文："+mt202.message());
        // mt202.getSwiftMessage().setUETR();
        // mt202.getSwiftMessage().setServiceTypeIdentifier("SHENZHAOLA");
        // mt202.getSwiftMessage().getBlock3().append(new Field108("sadsad"));
        // System.out.println("更改后报文："+mt202.message());

        // if (swiftMessage.isAck()) {// 判断是否ACK,更新原交易流水
        // swiftMessage = SwiftMessage.parse(swiftMessage.getUnparsedTexts().getText(0));
        //// String MsgType = swiftMessage.getBlock2().getMessageType();
        //// String dealno = swiftMessage.getBlock4().getTagValue(Field20.NAME).substring(2, 9);
        //// System.out.println("ACK:"+MsgType + ":" +"\n :"+swiftMessage);
        // }else if(swiftMessage.isNack()){
        // swiftMessage = SwiftMessage.parse(swiftMessage.getUnparsedTexts().getText(0));
        //// String MsgType = swiftMessage.getBlock2().getMessageType();
        //// String dealno = swiftMessage.getBlock4().getTagValue(Field20.NAME).substring(2, 9);
        //// System.out.println("NACK:"+MsgType + ":" + dealno);
        // }else if (swiftMessage.isOutgoing()) {
        // System.out.println(swiftMessage);
        // }

        // MT300 mt300 = new MT300();
        // mt300 = mt300.parse(out.toString());

        // MT300 mt300 = new MT300();
        //
        // SwiftBlock1 block1 = new SwiftBlock1();
        // block1.setApplicationId(SwiftBlock1.APPLICATION_ID_FIN);
        // block1.setServiceId(ServiceIdType._01.number());
        // block1.setLogicalTerminal(new LogicalTerminalAddress("HXBKCNBJ").getSenderLogicalTerminalAddress());
        // block1.setSessionNumber("0000");
        // block1.setSequenceNumber("000000");
        //
        // SwiftBlock2Input block2Input =new SwiftBlock2Input();
        // block2Input.setMessageType(MT300.NAME);
        // block2Input.setReceiverAddress(new LogicalTerminalAddress("HXBKCNBJ").getReceiverLogicalTerminalAddress());
        // block2Input.setMessagePriority(MessagePriority.N.name());
        //
        // SwiftBlock4 block4 =new SwiftBlock4();
        // block4.append(new Field15A());
        // block4.append(new Tag("20:0120449550110901"));
        // block4.append(new Field21(SchemeConstantsN.NEW));
        // block4.append(new Field94A(SchemeConstantsN.NEWT));
        // block4.append(new Field22C("HFBASD7619HXBKBJ"));
        // block4.append(new Field82A("HFBACNSD"));
        // block4.append(new Field87A("HXBKCNBJ"));
        // block4.append(new Field15B());
        // block4.append(new Field30T("20161109"));
        // block4.append(new Field30V("20161111"));
        // block4.append(new Field36().setComponent1(6.7619));
        // block4.append(new Field32B().setCurrency("CNY").setAmount("4733330"));
        // block4.append(new Field57A().setBIC("HFBACNSD"));
        // block4.append(new Field33B().setCurrency("USD").setAmount("700000"));
        // block4.append(new Field57A().setBIC("BKCHUS33"));
        // block4.append(new Field58A().setBIC("HXBKCNBJ"));
        // block4.append(new Field15C());
        // block4.append(new Field72().setComponent1("/SOURCE/DIRECT"));
        //
        // mt300.getSwiftMessage().setBlock1(block1);
        // mt300.getSwiftMessage().setBlock2(block2Input);
        // mt300.getSwiftMessage().setBlock4(block4);
        //
        // System.out.println(mt300.message());
    	
    	
    	
    }
}
