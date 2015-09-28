package test.outmsg;

import bean.massage.out.rsp.WX_ImageMessage_OUT;
import bean.massage.out.rsp.mb.WX_Image;
import control.WX_XmlControler;
import util.WX_RESP_Util;
import util.WX_Static;

public class WX_ImageMessage_OUT_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WX_ImageMessage_OUT out = new WX_ImageMessage_OUT();
		out.setCreateTime(WX_Static.getCurrentTime());
		out.setFromUserName("fromUserName");
		WX_Image image = new WX_Image();
		image.setMediaId("mediaId1234567");
		out.setImage(image);
		out.setMsgType(WX_RESP_Util.image);
		out.setToUserName("toUserName");
		System.out.println(WX_XmlControler.object2xml(out));
	}
}
