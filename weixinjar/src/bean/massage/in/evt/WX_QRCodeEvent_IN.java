package bean.massage.in.evt;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 扫描带参数二维码事件
 * @author YanFuzhong
 * @date 2015-9-24 下午09:58:57
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_QRCodeEvent_IN  extends WX_BaseEvent_IN{
	/**
	 * 事件KEY值
	 */
	private String EventKey;
	/**
	 * 用于换取二维码图片
	 */
	private String Ticket;
	
	/**
	 * 获得{@link #EventKey}的值
	 * @return 成员变量EventKey (数据类型 String)
	 */
	public String getEventKey() {
		return EventKey;
	}

	/**
	 * 获得{@link #Ticket}的值
	 * @return 成员变量Ticket (数据类型 String)
	 */
	public String getTicket() {
		return Ticket;
	}

	/**
	 * 设置成员变量{@link #EventKey}的值
	 * @param eventKey 成员变量 (数据类型 String)
	 */
	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}

	/**
	 * 设置成员变量{@link #Ticket}的值
	 * @param ticket 成员变量 (数据类型 String)
	 */
	public void setTicket(String ticket) {
		Ticket = ticket;
	}

	@Override
	public String toString() {
		return "WX_QRCodeEvent_IN [EventKey=" + EventKey + ", Ticket=" + Ticket
				+ "]";
	}
	
}
