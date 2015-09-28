package bean.massage.out.rsp;

import bean.massage.out.rsp.mb.WX_Video;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 回复的视频消息
 * @author YanFuzhong
 * @date 2015-9-24 下午10:07:39
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_VideoMessage_OUT extends WX_BaseMessage_OUT {
	/**
	 * 视频
	 */
	private WX_Video Video;
	

	/**
	 * 获得{@link #Video}的值
	 * @return 成员变量Video (数据类型 WX_Video)
	 */
	public WX_Video getVideo() {
		return Video;
	}


	/**
	 * 设置成员变量{@link #Video}的值
	 * @param video 成员变量 (数据类型 WX_Video)
	 */
	public void setVideo(WX_Video video) {
		Video = video;
	}


	@Override
	public String toString() {
		return "WX_VideoMessage_OUT [Video=" + Video + "]";
	}
}
