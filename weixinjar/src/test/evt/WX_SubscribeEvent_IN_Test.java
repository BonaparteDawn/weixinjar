package test.evt;

import bean.massage.in.evt.WX_SubscribeEvent_IN;
import control.WX_XmlControler;
import util.WX_EVENT_Util;
import util.WX_REQ_Util;
import util.WX_Static;

public class WX_SubscribeEvent_IN_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WX_SubscribeEvent_IN in = new WX_SubscribeEvent_IN();
		in.setCreateTime(WX_Static.getCurrentTime());
		in.setEvent(WX_EVENT_Util.subscribe);
		in.setFromUserName("fromUserName");
		in.setMsgType(WX_REQ_Util.event);
		in.setToUserName("toUserName");
		
		System.out.println(WX_XmlControler.object2xml(in));
	}
}
