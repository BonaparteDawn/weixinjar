package bean.menu;

/**
 * 
 * click���͵İ�ť
 * @author YanFuzhong
 * @date 2015-9-27 ����04:26:59
 * @version 1.0
 */
public class WX_ClickButton extends WX_ButtonBase {
	/**
	 * ��ť������
	 */
	private String type;
	/**
	 * ��ť�ļ�ֵ
	 */
	private String key;
	/**
	 * ���{@link #type}��ֵ
	 * @return ��Ա����type (�������� String)
	 */
	public String getType() {
		return type;
	}
	/**
	 * ���{@link #key}��ֵ
	 * @return ��Ա����key (�������� String)
	 */
	public String getKey() {
		return key;
	}
	/**
	 * ���ó�Ա����{@link #type}��ֵ
	 * @param type ��Ա���� (�������� String)
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * ���ó�Ա����{@link #key}��ֵ
	 * @param key ��Ա���� (�������� String)
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WX_ClickButton [type=" + type + ", key=" + key + "]";
	}
	
}