package test.outmsg;

import bean.massage.out.rsp.WX_VoiceMessage_OUT;
import bean.massage.out.rsp.mb.WX_Voice;
import control.WX_XmlControler;
import util.WX_RESP_Util;
import util.WX_Static;

public class WX_VoiceMessage_OUT_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WX_VoiceMessage_OUT out = new WX_VoiceMessage_OUT();
		out.setCreateTime(WX_Static.getCurrentTime());
		out.setFromUserName("fromUserName");
		out.setMsgType(WX_RESP_Util.voice);
		out.setToUserName("toUserName");
		WX_Voice voice = new WX_Voice();
		voice.setMediaId("mediaId");
		out.setVoice(voice );
		
		System.out.println(WX_XmlControler.object2xml(out));
	}
}
