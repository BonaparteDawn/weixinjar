package bean.massage.out.rsp;

import bean.massage.out.rsp.mb.WX_Video;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * �ظ�����Ƶ��Ϣ
 * @author YanFuzhong
 * @date 2015-9-24 ����10:07:39
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_VideoMessage_OUT extends WX_BaseMessage_OUT {
	/**
	 * ��Ƶ
	 */
	private WX_Video Video;
	

	/**
	 * ���{@link #Video}��ֵ
	 * @return ��Ա����Video (�������� WX_Video)
	 */
	public WX_Video getVideo() {
		return Video;
	}


	/**
	 * ���ó�Ա����{@link #Video}��ֵ
	 * @param video ��Ա���� (�������� WX_Video)
	 */
	public void setVideo(WX_Video video) {
		Video = video;
	}


	@Override
	public String toString() {
		return "WX_VideoMessage_OUT [Video=" + Video + "]";
	}
}
