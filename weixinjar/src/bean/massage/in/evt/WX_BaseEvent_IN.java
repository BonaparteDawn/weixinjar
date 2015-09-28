package bean.massage.in.evt;
import bean.massage.in.WX_MessageIN;
import util.WX_EVENT_Util;
/**
 * 事件基类
 * @author YanFuzhong
 * @date 2015-9-24 下午09:57:05
 * @version 1.0
 */

public class WX_BaseEvent_IN extends WX_MessageIN{
	/**
	 * 事件类型
	 */
	private WX_EVENT_Util Event;
	
	/**
	 * 获得{@link #Event}的值
	 * @return 成员变量Event (数据类型 WX_EVENT_Util)
	 */
	public WX_EVENT_Util getEvent() {
		return Event;
	}

	/**
	 * 设置成员变量{@link #Event}的值
	 * @param event 成员变量 (数据类型 WX_EVENT_Util)
	 */
	public void setEvent(WX_EVENT_Util event) {
		Event = event;
	}

	@Override
	public String toString() {
		return "WX_BaseEvent_IN [Event=" + Event + "]";
	}
}