package com.shuttle.common.utils;

import java.security.MessageDigest;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class MD5Utils {
	private static final String SALT = "1qazxsw2";

	private static final String ALGORITH_NAME = "md5";

	private static final int HASH_ITERATIONS = 2;

	public static String encrypt(String pswd) {
		String newPassword = new SimpleHash(ALGORITH_NAME, pswd, ByteSource.Util.bytes(SALT), HASH_ITERATIONS).toHex();
		return newPassword;
	}

	public static String encrypt(String username, String pswd) {
		String newPassword = new SimpleHash(ALGORITH_NAME, pswd, ByteSource.Util.bytes(username + SALT),
				HASH_ITERATIONS).toHex();
		return newPassword;
	}
	/**
	 * 对字符串md5加密(小写+字母)
	 * 
	 * @param str
	 *            传入要加密的字符串
	 * @return MD5加密后的字符串
	 */
	public static String getMD5(String message) {
		String md5 = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5"); // 创建一个md5算法对象
			byte[] messageByte = message.getBytes("UTF-8");
			byte[] md5Byte = md.digest(messageByte); // 获得MD5字节数组,16*8=128位
			md5 = bytesToHex(md5Byte); // 转换为16进制字符串
		} catch (Exception e) {
			e.printStackTrace();
		}
		return md5;
	}

	// 二进制转十六进制
	public static String bytesToHex(byte[] bytes) {
		StringBuffer hexStr = new StringBuffer();
		int num;
		for (int i = 0; i < bytes.length; i++) {
			num = bytes[i];
			if (num < 0) {
				num += 256;
			}
			if (num < 16) {
				hexStr.append("0");
			}
			hexStr.append(Integer.toHexString(num));
		}
		return hexStr.toString();
	}

	/**
	 * 对字符串md5加密3次(小写+字母)
	 * 
	 * @param str
	 * @return
	 */
	public static String getMD5By3Times(String str) {
		return getMD5(getMD5(getMD5(str)));
	}

	public static void main(String[] args) {
		
		System.out.println(MD5Utils.getMD5By3Times("123456"));
	}

}
