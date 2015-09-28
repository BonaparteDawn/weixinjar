package bean.massage.out.rsp.mb;

import bean.WX_Object;

/**
 * ����ģ��
 * @author YanFuzhong
 * @date 2015-9-24 ����10:04:36
 * @version 1.0
 */
public class WX_Music  extends WX_Object{
	/**
	 * ���ֱ���
	 */
	private String Title;
	/**
	 * ��������
	 */
	private String Description;
	/**
	 * ��������
	 */
	private String MusicUrl;
	/**
	 * �������������� (WiFi��������ʹ�ø����Ӳ�������)
	 */
	private String HQMusicUrl;
	/**
	 * ����ͼ��ý��ID (ͨ���ϴ��Ķ�ý���ļ��õ�ID)
	 */
	private String ThumbMediaId;
	
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
	 * ���{@link #MusicUrl}��ֵ
	 * @return ��Ա����MusicUrl (�������� String)
	 */
	public String getMusicUrl() {
		return MusicUrl;
	}

	/**
	 * ���{@link #HQMusicUrl}��ֵ
	 * @return ��Ա����HQMusicUrl (�������� String)
	 */
	public String getHQMusicUrl() {
		return HQMusicUrl;
	}

	/**
	 * ���{@link #ThumbMediaId}��ֵ
	 * @return ��Ա����ThumbMediaId (�������� String)
	 */
	public String getThumbMediaId() {
		return ThumbMediaId;
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
	 * ���ó�Ա����{@link #MusicUrl}��ֵ
	 * @param musicUrl ��Ա���� (�������� String)
	 */
	public void setMusicUrl(String musicUrl) {
		MusicUrl = musicUrl;
	}

	/**
	 * ���ó�Ա����{@link #HQMusicUrl}��ֵ
	 * @param hQMusicUrl ��Ա���� (�������� String)
	 */
	public void setHQMusicUrl(String hQMusicUrl) {
		HQMusicUrl = hQMusicUrl;
	}

	/**
	 * ���ó�Ա����{@link #ThumbMediaId}��ֵ
	 * @param thumbMediaId ��Ա���� (�������� String)
	 */
	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}

	@Override
	public String toString() {
		return "Music [Title=" + Title + ", Description=" + Description
				+ ", MusicUrl=" + MusicUrl + ", HQMusicUrl=" + HQMusicUrl
				+ ", ThumbMediaId=" + ThumbMediaId + "] ";
	}
	
}
