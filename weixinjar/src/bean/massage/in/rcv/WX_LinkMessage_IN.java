package bean.massage.in.rcv;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ������Ϣ
 * @author YanFuzhong
 * @date 2015-9-24 ����10:01:03
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_LinkMessage_IN  extends WX_BaseMessage_IN{
	/**
	 * ��Ϣ����
	 */
	private String Title;
	/**
	 * ��Ϣ����
	 */
	private String Description;
	/**
	 * ��Ϣ����
	 */
	private String Url;
	
	/**
	 * ���{@link #Title}��ֵ
	 * @return ��Ա����Title (�������� String)
	 */
	public String getTitle() {
		return Title;
	}

	/**
	 * ���{@link #Description}��ֵ
	 * @return ��Ա����Description (�������� String)
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * ���{@link #Url}��ֵ
	 * @return ��Ա����Url (�������� String)
	 */
	public String getUrl() {
		return Url;
	}

	/**
	 * ���ó�Ա����{@link #Title}��ֵ
	 * @param title ��Ա���� (�������� String)
	 */
	public void setTitle(String title) {
		Title = title;
	}

	/**
	 * ���ó�Ա����{@link #Description}��ֵ
	 * @param description ��Ա���� (�������� String)
	 */
	public void setDescription(String description) {
		Description = description;
	}

	/**
	 * ���ó�Ա����{@link #Url}��ֵ
	 * @param url ��Ա���� (�������� String)
	 */
	public void setUrl(String url) {
		Url = url;
	}

	@Override
	public String toString() {
		return "WX_LinkMessage_IN [Title=" + Title + ", Description="
				+ Description + ", Url=" + Url + "]";
	}
}
