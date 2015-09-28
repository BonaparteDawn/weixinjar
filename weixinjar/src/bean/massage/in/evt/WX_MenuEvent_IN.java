package bean.massage.in.evt;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * �Զ���˵��¼�
 * @author YanFuzhong
 * @date 2015-9-24 ����09:58:25
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_MenuEvent_IN  extends WX_BaseEvent_IN{
	/**
	 * �¼�KEYֵ (���Զ����¼��ӿ���KEY��Ӧ)
	 */
	private String EventKey;
	
	/**
	 * ���{@link #EventKey}��ֵ
	 * @return ��Ա����EventKey (�������� String)
	 */
	public String getEventKey() {
		return EventKey;
	}

	/**
	 * ���ó�Ա����{@link #EventKey}��ֵ
	 * @param eventKey ��Ա���� (�������� String)
	 */
	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}

	@Override
	public String toString() {
		return "WX_MenuEvent_IN [EventKey=" + EventKey + "]";
	}
}
