package test.rcvmsg;

import bean.massage.in.rcv.WX_LocationMessage_IN;
import control.WX_XmlControler;
import util.WX_REQ_Util;
import util.WX_Static;


public class WX_LocationMessage_IN_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WX_LocationMessage_IN in = new WX_LocationMessage_IN();
		in.setCreateTime(WX_Static.getCurrentTime());
		in.setFromUserName("fromUserName");
		in.setLabel("label");
		in.setLocation_X("123");
		in.setLocation_Y("123");
		in.setMsgId(123);
		in.setMsgType(WX_REQ_Util.location);
		in.setScale("scale");
		in.setToUserName("toUserName");
		System.out.println(WX_XmlControler.object2xml(in));
	}
}
