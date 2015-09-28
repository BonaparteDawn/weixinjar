package bean.massage.in.evt;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 自定义菜单事件
 * @author YanFuzhong
 * @date 2015-9-24 下午09:58:25
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_MenuEvent_IN  extends WX_BaseEvent_IN{
	/**
	 * 事件KEY值 (与自定义事件接口中KEY对应)
	 */
	private String EventKey;
	
	/**
	 * 获得{@link #EventKey}的值
	 * @return 成员变量EventKey (数据类型 String)
	 */
	public String getEventKey() {
		return EventKey;
	}

	/**
	 * 设置成员变量{@link #EventKey}的值
	 * @param eventKey 成员变量 (数据类型 String)
	 */
	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}

	@Override
	public String toString() {
		return "WX_MenuEvent_IN [EventKey=" + EventKey + "]";
	}
}
