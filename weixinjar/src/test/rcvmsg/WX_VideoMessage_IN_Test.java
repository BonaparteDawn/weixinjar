package test.rcvmsg;

import bean.massage.in.rcv.WX_VideoMessage_IN;
import control.WX_XmlControler;
import util.WX_REQ_Util;
import util.WX_Static;

public class WX_VideoMessage_IN_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WX_VideoMessage_IN in = new WX_VideoMessage_IN();
		in.setCreateTime(WX_Static.getCurrentTime());
		in.setFromUserName("fromUserName");
		in.setMediaId("mediaId");
		in.setMsgId(123);
		in.setMsgType(WX_REQ_Util.video);
		in.setThumbMediaId("thumbMediaId");
		in.setToUserName("toUserName");
		System.out.println(WX_XmlControler.object2xml(in));
	}
}
