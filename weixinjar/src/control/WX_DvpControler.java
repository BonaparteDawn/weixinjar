package control;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;

import bean.WX_Object;
import util.WX_Static;

/**
 * 
 * ��������ݿ�����
 * @author YanFuzhong
 * @date 2015-9-26 ����02:17:24
 * @version 1.0
 */
public class WX_DvpControler  extends WX_Object{
	/**
	 * У��ǩ��
	 * @param timestamp ʱ���
	 * @param nonce �����
	 * @param signature ΢�ż���ǩ��
	 * @return boolean У���Ƿ�ͨ��
	 */
	public static boolean checkSignature(Map<String, String> map){
		boolean res = false;
		if (map == null) {
			return res;
		}
		String timestamp = map.get("timestamp");
		String nonce =map.get("nonce");
		String signature =map.get("signature");
		// ��token��timestamp��nonce���ֵ�����
		String[] paramArr = new String[] { WX_Static.devConfig.getToken(), timestamp, nonce };
		Arrays.sort(paramArr);
		// �������Ľ��ƴ�ӳ�һ���ַ���
		String content = paramArr[0].concat(paramArr[1]).concat(paramArr[2]);
		String ciphertext = null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			// �ԽӺ���ַ�������sha1����
			byte[] digest = md.digest(content.toString().getBytes());
			ciphertext = byteToStr(digest);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		// ��sha1���ܺ���ַ�����signature���жԱ�
		res= ciphertext != null ? ciphertext.equals(signature.toUpperCase()) : false;
		return res;
	}
	/**
	 * ���ֽ�����ת��Ϊʮ�������ַ���
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
	 * ���ֽ�ת��Ϊʮ�������ַ���
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
