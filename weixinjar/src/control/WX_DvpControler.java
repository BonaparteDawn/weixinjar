package control;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;

import bean.WX_Object;
import util.WX_Static;

/**
 * 
 * 开发者身份控制器
 * @author YanFuzhong
 * @date 2015-9-26 下午02:17:24
 * @version 1.0
 */
public class WX_DvpControler  extends WX_Object{
	/**
	 * 校验签名
	 * @param timestamp 时间戳
	 * @param nonce 随机数
	 * @param signature 微信加密签名
	 * @return boolean 校验是否通过
	 */
	public static boolean checkSignature(Map<String, String> map){
		boolean res = false;
		if (map == null) {
			return res;
		}
		String timestamp = map.get("timestamp");
		String nonce =map.get("nonce");
		String signature =map.get("signature");
		// 对token、timestamp和nonce按字典排序
		String[] paramArr = new String[] { WX_Static.devConfig.getToken(), timestamp, nonce };
		Arrays.sort(paramArr);
		// 将排序后的结果拼接成一个字符串
		String content = paramArr[0].concat(paramArr[1]).concat(paramArr[2]);
		String ciphertext = null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			// 对接后的字符串进行sha1加密
			byte[] digest = md.digest(content.toString().getBytes());
			ciphertext = byteToStr(digest);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		// 将sha1加密后的字符串与signature进行对比
		res= ciphertext != null ? ciphertext.equals(signature.toUpperCase()) : false;
		return res;
	}
	/**
	 * 将字节数组转换为十六进制字符串
	 * @param byteArray
	 * @return String
	 */
	private static String byteToStr(byte[] byteArray) {
		String strDigest = "";
		for (int i = 0; i < byteArray.length; i++) {
			strDigest += byteToHexStr(byteArray[i]);
		}
		return strDigest;
	}

	/**
	 * 将字节转换为十六进制字符串
	 * @param mByte
	 * @return String
	 */
	private static String byteToHexStr(byte mByte) {
		char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		char[] tempArr = new char[2];
		tempArr[0] = Digit[(mByte >>> 4) & 0X0F];
		tempArr[1] = Digit[mByte & 0X0F];
		String s = new String(tempArr);
		return s;
	}
}
