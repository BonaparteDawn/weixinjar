package bean.massage.out.rsp.mb;

import bean.WX_Object;

/**
 * ����ģ��
 * @author YanFuzhong
 * @date 2015-9-24 ����10:05:59
 * @version 1.0
 */
public class WX_Voice  extends WX_Object{
	/**
	 * ý���ļ�ID
	 */
	private String MediaId;
	
	/**
	 * ���{@link #MediaId}��ֵ
	 * @return ��Ա����MediaId (�������� String)
	 */
	public String getMediaId() {
		return MediaId;
	}

	/**
	 * ���ó�Ա����{@link #MediaId}��ֵ
	 * @param mediaId ��Ա���� (�������� String)
	 */
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	@Override
	public String toString() {
		return "Voice [MediaId=" + MediaId + "] ";
	}
	
}
