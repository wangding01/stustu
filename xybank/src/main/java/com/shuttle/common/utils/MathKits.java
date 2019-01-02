package com.shuttle.common.utils;

import java.text.DecimalFormat;

/**
 * 
 * @author dongao
 *
 */
public class MathKits {

	/**
	 * 格式化数字
	 * @param shuzi 
	 * @param format
	 * @return
	 */
	public static Double formatShuzi(Double shuzi, String format){
		DecimalFormat decimalFormat = new DecimalFormat(format);
		String result = "0";
		result = decimalFormat.format(shuzi);
		return Double.parseDouble(result);
	}
	
	public static void main(String[] args) {
		System.out.println(MathKits.formatShuzi((Double.parseDouble(67407000+"")/1000/60/60), "#.000"));
	}
}
