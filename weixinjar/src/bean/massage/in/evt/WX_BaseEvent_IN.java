package bean.massage.in.evt;
import bean.massage.in.WX_MessageIN;
import util.WX_EVENT_Util;
/**
 * �¼�����
 * @author YanFuzhong
 * @date 2015-9-24 ����09:57:05
 * @version 1.0
 */

public class WX_BaseEvent_IN extends WX_MessageIN{
	/**
	 * �¼�����
	 */
	private WX_EVENT_Util Event;
	
	/**
	 * ���{@link #Event}��ֵ
	 * @return ��Ա����Event (�������� WX_EVENT_Util)
	 */
	public WX_EVENT_Util getEvent() {
		return Event;
	}

	/**
	 * ���ó�Ա����{@link #Event}��ֵ
	 * @param event ��Ա���� (�������� WX_EVENT_Util)
	 */
	public void setEvent(WX_EVENT_Util event) {
		Event = event;
	}

	@Override
	public String toString() {
		return "WX_BaseEvent_IN [Event=" + Event + "]";
	}
}