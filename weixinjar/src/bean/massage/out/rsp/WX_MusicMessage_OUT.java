package bean.massage.out.rsp;

import bean.massage.out.rsp.mb.WX_Music;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 回复的音乐消息
 * @author YanFuzhong
 * @date 2015-9-24 下午10:06:35
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_MusicMessage_OUT extends WX_BaseMessage_OUT {
	/**
	 * 音乐
	 */
	private WX_Music Music;
	
	/**
	 * 获得{@link #Music}的值
	 * @return 成员变量Music (数据类型 WX_Music)
	 */
	public WX_Music getMusic() {
		return Music;
	}

	/**
	 * 设置成员变量{@link #Music}的值
	 * @param music 成员变量 (数据类型 WX_Music)
	 */
	public void setMusic(WX_Music music) {
		Music = music;
	}

	@Override
	public String toString() {
		return "WX_MusicMessage_OUT [Music=" + Music + "]";
	}
}
