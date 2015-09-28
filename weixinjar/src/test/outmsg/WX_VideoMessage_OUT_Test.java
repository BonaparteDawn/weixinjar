package test.outmsg;

import bean.massage.out.rsp.WX_VideoMessage_OUT;
import bean.massage.out.rsp.mb.WX_Video;
import control.WX_XmlControler;
import util.WX_RESP_Util;
import util.WX_Static;

public class WX_VideoMessage_OUT_Test {
	public static void main(String[] args) {
		WX_VideoMessage_OUT out = new WX_VideoMessage_OUT();
		out.setCreateTime(WX_Static.getCurrentTime());
		out.setFromUserName("fromUserName");
		out.setMsgType(WX_RESP_Util.video);
		out.setToUserName("toUserName");
		WX_Video video = new WX_Video();
		video.setMediaId("mediaId");
		video.setThumbMediaId("mediaId");
		out.setVideo(video);
		
		System.out.println(WX_XmlControler.object2xml(out));
	}
}
