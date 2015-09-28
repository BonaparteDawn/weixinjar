package util;
/**
 * 事件枚举
 * @author YanFuzhong
 * @date 2015-09-17
 * @version 1.0
 */
public enum WX_EVENT_Util {
	/**订阅*/
	subscribe,
	/**取消订阅*/
	unsubscribe,
	/**关注用户扫描带参数二维码*/
	scan,
	/**上报地理位置*/
	LOCATION,
	/**自定义菜单*/
	CLICK
}
