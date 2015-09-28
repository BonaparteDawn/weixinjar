package bean.massage.in.rcv;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ������Ϣ
 * @author YanFuzhong
 * @date 2015-9-24 ����10:02:17
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_VoiceMessage_IN  extends WX_BaseMessage_IN{
	/**
	 * ý��ID
	 */
	private String MediaId;
	/**
	 * ������ʽ
	 */
	private String Format;
	/**
	 * ����ʶ���� (UTF-8����)
	 */
	private String Recognition;
	
	/**
	 * ���{@link #MediaId}��ֵ
	 * @return ��Ա����MediaId (�������� String)
	 */
	public String getMediaId() {
		return MediaId;
	}

	/**
	 * ���{@link #Format}��ֵ
	 * @return ��Ա����Format (�������� String)
	 */
	public String getFormat() {
		return Format;
	}

	/**
	 * ���{@link #Recognition}��ֵ
	 * @return ��Ա����Recognition (�������� String)
	 */
	public String getRecognition() {
		return Recognition;
	}

	/**
	 * ���ó�Ա����{@link #MediaId}��ֵ
	 * @param mediaId ��Ա���� (�������� String)
	 */
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	/**
	 * ���ó�Ա����{@link #Format}��ֵ
	 * @param format ��Ա���� (�������� String)
	 */
	public void setFormat(String format) {
		Format = format;
	}

	/**
	 * ���ó�Ա����{@link #Recognition}��ֵ
	 * @param recognition ��Ա���� (�������� String)
	 */
	public void setRecognition(String recognition) {
		Recognition = recognition;
	}

	@Override
	public String toString() {
		return "WX_VoiceMessage_IN [MediaId=" + MediaId + ", Format=" + Format
				+ ", Recognition=" + Recognition + "]";
	}
}
