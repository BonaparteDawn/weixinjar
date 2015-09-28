package bean.massage.in.rcv;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ��Ƶ��Ϣ
 * @author YanFuzhong
 * @date 2015-9-24 ����09:53:59
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_VideoMessage_IN  extends WX_BaseMessage_IN {
	/**
	 * ��Ƶ��Ϣý��ID
	 */
	private String MediaId;
	/**
	 * ��Ƶ��Ϣ����ͼ��ý��ID
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
		return "WX_VideoMessage_IN [MediaId=" + MediaId + ", ThumbMediaId="
				+ ThumbMediaId + "]";
	}
}
