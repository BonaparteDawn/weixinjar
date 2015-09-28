package bean.massage.out.rsp.mb;

import bean.WX_Object;

/**
 * ��Ƶģ��
 * @author YanFuzhong
 * @date 2015-9-24 ����10:05:37
 * @version 1.0
 */
public class WX_Video  extends WX_Object{
	/**
	 * ý���ļ�ID
	 */
	private String MediaId;
	/**
	 * ����ͼ��ý��ID
	 */
	private String ThumbMediaId;
	
	/**
	 * ���{@link #MediaId}��ֵ
	 * @return ��Ա����MediaId (�������� String)
	 */
	public String getMediaId() {
		return MediaId;
	}

	/**
	 * ���{@link #ThumbMediaId}��ֵ
	 * @return ��Ա����ThumbMediaId (�������� String)
	 */
	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	/**
	 * ���ó�Ա����{@link #MediaId}��ֵ
	 * @param mediaId ��Ա���� (�������� String)
	 */
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
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
		return "Video [MediaId=" + MediaId + ", ThumbMediaId=" + ThumbMediaId
				+ "] ";
	}
	
}
