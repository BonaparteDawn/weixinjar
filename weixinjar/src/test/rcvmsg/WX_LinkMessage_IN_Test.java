package test.rcvmsg;

import bean.massage.in.rcv.WX_LinkMessage_IN;
import control.WX_XmlControler;
import util.WX_REQ_Util;
import util.WX_Static;

public class WX_LinkMessage_IN_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WX_LinkMessage_IN in = new WX_LinkMessage_IN();
		in.setCreateTime(WX_Static.getCurrentTime());
		in.setDescription("description");
		in.setFromUserName("fromUserName");
		in.setMsgId(123);
		in.setMsgType(WX_REQ_Util.link);
		in.setTitle("title");
		in.setToUserName("toUserName");
		in.setUrl("url");
		
		System.out.println(WX_XmlControler.object2xml(in));
	}
}
