package test.outmsg;

import bean.massage.out.rsp.WX_TextMessage_OUT;
import control.WX_XmlControler;
import util.WX_RESP_Util;
import util.WX_Static;

public class WX_TextMessage_OUT_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WX_TextMessage_OUT out = new WX_TextMessage_OUT();
		out.setContent("content");
		out.setCreateTime(WX_Static.getCurrentTime());
		out.setFromUserName("fromUserName");
		out.setMsgType(WX_RESP_Util.text);
		out.setToUserName("toUserName");
		System.out.println(WX_XmlControler.object2xml(out));
	}

}
