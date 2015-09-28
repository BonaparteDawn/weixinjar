package test.outmsg;

import bean.massage.out.rsp.WX_MusicMessage_OUT;
import bean.massage.out.rsp.mb.WX_Music;
import control.WX_XmlControler;
import util.WX_RESP_Util;
import util.WX_Static;

public class WX_MusicMessage_OUT_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WX_MusicMessage_OUT out = new WX_MusicMessage_OUT();
		out.setCreateTime(WX_Static.getCurrentTime());
		out.setFromUserName("fromUserName");
		out.setMsgType(WX_RESP_Util.music);
		WX_Music music = new WX_Music();
		music.setDescription("description");
		music.setHQMusicUrl("hQMusicUrl");
		music.setMusicUrl("musicUrl");
		music.setThumbMediaId("thumbMediaId");
		music.setTitle("title");
		out.setMusic(music);
		out.setToUserName("toUserName");
		
		System.out.println(WX_XmlControler.object2xml(out));
	}

}
