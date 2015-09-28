package bean.massage.in.evt;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ɨ���������ά���¼�
 * @author YanFuzhong
 * @date 2015-9-24 ����09:58:57
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_QRCodeEvent_IN  extends WX_BaseEvent_IN{
	/**
	 * �¼�KEYֵ
	 */
	private String EventKey;
	/**
	 * ���ڻ�ȡ��ά��ͼƬ
	 */
	private String Ticket;
	
	/**
	 * ���{@link #EventKey}��ֵ
	 * @return ��Ա����EventKey (�������� String)
	 */
	public String getEventKey() {
		return EventKey;
	}

	/**
	 * ���{@link #Ticket}��ֵ
	 * @return ��Ա����Ticket (�������� String)
	 */
	public String getTicket() {
		return Ticket;
	}

	/**
	 * ���ó�Ա����{@link #EventKey}��ֵ
	 * @param eventKey ��Ա���� (�������� String)
	 */
	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}

	/**
	 * ���ó�Ա����{@link #Ticket}��ֵ
	 * @param ticket ��Ա���� (�������� String)
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
