package bean.massage.in.rcv;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 语音消息
 * @author YanFuzhong
 * @date 2015-9-24 下午10:02:17
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_VoiceMessage_IN  extends WX_BaseMessage_IN{
	/**
	 * 媒体ID
	 */
	private String MediaId;
	/**
	 * 语音格式
	 */
	private String Format;
	/**
	 * 语音识别结果 (UTF-8编码)
	 */
	private String Recognition;
	
	/**
	 * 获得{@link #MediaId}的值
	 * @return 成员变量MediaId (数据类型 String)
	 */
	public String getMediaId() {
		return MediaId;
	}

	/**
	 * 获得{@link #Format}的值
	 * @return 成员变量Format (数据类型 String)
	 */
	public String getFormat() {
		return Format;
	}

	/**
	 * 获得{@link #Recognition}的值
	 * @return 成员变量Recognition (数据类型 String)
	 */
	public String getRecognition() {
		return Recognition;
	}

	/**
	 * 设置成员变量{@link #MediaId}的值
	 * @param mediaId 成员变量 (数据类型 String)
	 */
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	/**
	 * 设置成员变量{@link #Format}的值
	 * @param format 成员变量 (数据类型 String)
	 */
	public void setFormat(String format) {
		Format = format;
	}

	/**
	 * 设置成员变量{@link #Recognition}的值
	 * @param recognition 成员变量 (数据类型 String)
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
