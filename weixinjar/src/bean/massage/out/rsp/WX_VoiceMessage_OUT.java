package bean.massage.out.rsp;

import bean.massage.out.rsp.mb.WX_Voice;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * �ظ���������Ϣ
 * @author YanFuzhong
 * @date 2015-9-24 ����10:07:50
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_VoiceMessage_OUT extends WX_BaseMessage_OUT {
	/**
	 * ����
	 */
	private WX_Voice Voice;
	
	/**
	 * ���{@link #Voice}��ֵ
	 * @return ��Ա����Voice (�������� WX_Voice)
	 */
	public WX_Voice getVoice() {
		return Voice;
	}

	/**
	 * ���ó�Ա����{@link #Voice}��ֵ
	 * @param voice ��Ա���� (�������� WX_Voice)
	 */
	public void setVoice(WX_Voice voice) {
		Voice = voice;
	}

	@Override
	public String toString() {
		return "WX_VoiceMessage_OUT [Voice=" + Voice + "]";
	}
	
}
