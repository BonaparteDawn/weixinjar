package test.evt;
import java.io.IOException;

import org.dom4j.DocumentException;

import bean.massage.in.evt.WX_LocationEvent_IN;

import control.WX_XmlControler;
import util.WX_EVENT_Util;
import util.WX_REQ_Util;
import util.WX_Static;
public class WX_LocationEvent_IN_Test {
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws DocumentException 
	 */
	public static void main(String[] args) throws IOException, DocumentException {
		WX_LocationEvent_IN event = new WX_LocationEvent_IN();
		event.setCreateTime(WX_Static.getCurrentTime());
		event.setEvent(WX_EVENT_Util.LOCATION);
		event.setFromUserName("fromUserName");
		event.setLatitude("latitude");
		event.setLongitude("longitude");
		event.setMsgType(WX_REQ_Util.text);
		event.setPrecision("precision");
		event.setToUserName("toUserName");
		System.out.println(WX_XmlControler.object2xml(event));
	}
}