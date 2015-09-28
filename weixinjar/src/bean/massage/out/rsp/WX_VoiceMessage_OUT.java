package bean.massage.out.rsp;

import bean.massage.out.rsp.mb.WX_Voice;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 回复的语音消息
 * @author YanFuzhong
 * @date 2015-9-24 下午10:07:50
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_VoiceMessage_OUT extends WX_BaseMessage_OUT {
	/**
	 * 语音
	 */
	private WX_Voice Voice;
	
	/**
	 * 获得{@link #Voice}的值
	 * @return 成员变量Voice (数据类型 WX_Voice)
	 */
	public WX_Voice getVoice() {
		return Voice;
	}

	/**
	 * 设置成员变量{@link #Voice}的值
	 * @param voice 成员变量 (数据类型 WX_Voice)
	 */
	public void setVoice(WX_Voice voice) {
		Voice = voice;
	}

	@Override
	public String toString() {
		return "WX_VoiceMessage_OUT [Voice=" + Voice + "]";
	}
	
}
