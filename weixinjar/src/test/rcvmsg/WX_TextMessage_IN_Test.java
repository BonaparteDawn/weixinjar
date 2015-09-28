package test.rcvmsg;

import bean.massage.in.rcv.WX_TextMessage_IN;
import control.WX_XmlControler;
import util.WX_REQ_Util;
import util.WX_Static;

public class WX_TextMessage_IN_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WX_TextMessage_IN in = new WX_TextMessage_IN();
		in.setContent("content");
		in.setCreateTime(WX_Static.getCurrentTime());
		in.setFromUserName("fromUserName");
		in.setMsgId(123);
		in.setMsgType(WX_REQ_Util.text);
		in.setToUserName("toUserName");
		System.out.println(WX_XmlControler.object2xml(in));
	}
}
