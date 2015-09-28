package bean.massage.in.evt;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 关注/取消关注关注事件
 * @author YanFuzhong
 * @date 2015-9-24 下午09:59:44
 * @version 1.0
 */
@XStreamAlias(value="xml")
public class WX_SubscribeEvent_IN extends WX_BaseEvent_IN{

	@Override
	public String toString() {
		return "WX_SubscribeEvent_IN []";
	}
}
