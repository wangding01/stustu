package com.study.demo.demo2020.day0129;

import java.util.Base64;

/**
 * 
 * @author wangding
 * @date 2020年1月29日 下午2:31:45
 * @Description：在Java 8中，Base64编码已经成为Java类库的标准。
 * 
 *                    Java 8 内置了 Base64 编码的编码器和解码器。
 * 
 *                    Base64工具类提供了一套静态方法获取下面三种BASE64编解码器：
 * 
 *                    基本：输出被映射到一组字符A-Za-z0-9+/，编码不添加任何行标，输出的解码仅支持A-Za-z0-9+/。
 *                    URL：输出映射到一组字符A-Za-z0-9+_，输出是URL和文件。
 *                    MIME：输出隐射到MIME友好格式。输出每行不超过76字符，并且使用'\r'并跟随'\n'作为分割。编码输出最后没有行分割。
 */
public class RunDemo01 {

	public static void main(String[] args) {
		String testStr = "https://www.runoob.com/java/java8-base64.html";
		String base64Encoder = Base64.getEncoder().encodeToString(testStr.getBytes());
		System.out.println("基本编码：" + base64Encoder);
		String base64Decoder = new String(Base64.getDecoder().decode(base64Encoder));
		System.out.println("基本解码：" + base64Decoder);
		System.out.println("--------urlencode---------------");
		String base64UrlEncoder = Base64.getUrlEncoder().encodeToString(testStr.getBytes());
		System.out.println("URL基本编码：" + base64UrlEncoder);
		String base64UrlDecoder = new String(Base64.getUrlDecoder().decode(base64UrlEncoder));
		System.out.println("URL基本解码：" + base64UrlDecoder);

	}
}
