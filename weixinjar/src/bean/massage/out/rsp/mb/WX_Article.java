package bean.massage.out.rsp.mb;

import bean.WX_Object;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ͼ��ģ��
 * @author YanFuzhong
 * @date 2015-9-24 ����10:02:55
 * @version 1.0
 */
@XStreamAlias(value = "item")
public class WX_Article  extends WX_Object{
	/**
	 * ͼ����Ϣ������
	 */
	private String Title;
	/**
	 * ͼ����Ϣ����
	 */
	private String Description;
	/**
	 * ͼƬ���� (֧��JPG\PNG,�Ϻõ�Ч���Ĵ�ͼ640*320���أ�Сͼ80*80����)
	 */
	private String PicUrl;
	/**
	 * ���ͼ����Ϣ����ת����
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
	 * ���{@link #PicUrl}��ֵ
	 * @return ��Ա����PicUrl (�������� String)
	 */
	public String getPicUrl() {
		return PicUrl;
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
	 * ���ó�Ա����{@link #PicUrl}��ֵ
	 * @param picUrl ��Ա���� (�������� String)
	 */
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
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
		return "WX_Article [Title=" + Title + ", Description=" + Description
				+ ", PicUrl=" + PicUrl + ", Url=" + Url + "]";
	}
	
}
