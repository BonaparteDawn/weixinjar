package bean.menu;

/**
 * 
 * view���͵İ�ť
 * @author YanFuzhong
 * @date 2015-9-27 ����04:26:20
 * @version 1.0
 */
public class WX_ViewButton extends WX_ButtonBase {
	/**
	 * ��ť����
	 */
	private String type;
	/**
	 * ��ť����
	 */
	private String url;
	/**
	 * ���{@link #type}��ֵ
	 * @return ��Ա����type (�������� String)
	 */
	public String getType() {
		return type;
	}
	/**
	 * ���{@link #url}��ֵ
	 * @return ��Ա����url (�������� String)
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * ���ó�Ա����{@link #type}��ֵ
	 * @param type ��Ա���� (�������� String)
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * ���ó�Ա����{@link #url}��ֵ
	 * @param url ��Ա���� (�������� String)
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WX_ViewButton [type=" + type + ", url=" + url + "]";
	}
}