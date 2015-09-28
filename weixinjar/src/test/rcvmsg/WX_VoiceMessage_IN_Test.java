package test.rcvmsg;

import bean.massage.in.rcv.WX_VoiceMessage_IN;
import control.WX_XmlControler;
import util.WX_REQ_Util;
import util.WX_Static;

public class WX_VoiceMessage_IN_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WX_VoiceMessage_IN in = new WX_VoiceMessage_IN();
		in.setCreateTime(WX_Static.getCurrentTime());
		in.setFormat("Format");
		in.setFromUserName("fromUserName");
		in.setMediaId("mediaId");
		in.setMsgId(123);
		in.setMsgType(WX_REQ_Util.voice);
		in.setRecognition("recognition");
		in.setToUserName("toUserName");
		System.out.println(WX_XmlControler.object2xml(in));
	}
}
