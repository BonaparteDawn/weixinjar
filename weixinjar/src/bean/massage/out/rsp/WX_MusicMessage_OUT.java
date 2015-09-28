package bean.massage.out.rsp;

import bean.massage.out.rsp.mb.WX_Music;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * �ظ���������Ϣ
 * @author YanFuzhong
 * @date 2015-9-24 ����10:06:35
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_MusicMessage_OUT extends WX_BaseMessage_OUT {
	/**
	 * ����
	 */
	private WX_Music Music;
	
	/**
	 * ���{@link #Music}��ֵ
	 * @return ��Ա����Music (�������� WX_Music)
	 */
	public WX_Music getMusic() {
		return Music;
	}

	/**
	 * ���ó�Ա����{@link #Music}��ֵ
	 * @param music ��Ա���� (�������� WX_Music)
	 */
	public void setMusic(WX_Music music) {
		Music = music;
	}

	@Override
	public String toString() {
		return "WX_MusicMessage_OUT [Music=" + Music + "]";
	}
}
