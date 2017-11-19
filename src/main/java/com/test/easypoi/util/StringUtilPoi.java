package com.test.easypoi.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilPoi {

	/**
	 * 根据传入长度值补齐长度
	 * 
	 * @param str
	 * @param length
	 * @return
	 */
	public static String getLengthStr(String str, int length) {

		if (str == null) {
			return new String("&nbsp");
		}
		if (length == 0) {
			// 默认设置长度为5
			length = 5;
		}
		int strLength = length(str);
		int sublength = length - strLength;

		if (strLength < length) {

			for (int i = 0; i < sublength; i++) {
				str += ' ';
			}
			return str;
		}
		// 长度超过length，不处理
		return str;
	}

	/**
	 * 得到一个字符串的长度,显示的长度,一个汉字或日韩文长度为2,英文字符长度为1
	 * 
	 * @param String
	 *            s 需要得到长度的字符串
	 * @return int 得到的字符串长度
	 */
	public static int length(String s) {
		if (s == null)
			return 0;
		char[] c = s.toCharArray();
		int len = 0;
		for (int i = 0; i < c.length; i++) {
			len++;
			if (!isLetter(c[i])) {
				len++;
			}
		}
		return len;
	}

	public static boolean isLetter(char c) {
		int k = 0x80;
		return c / k == 0 ? true : false;
	}

	/**
	 * 得到一个字符串的长度,显示的长度,一个汉字或日韩文长度为1,英文字符长度为0.5
	 * 
	 * @param String
	 *            s 需要得到长度的字符串
	 * @return int 得到的字符串长度
	 */
	public static double getLength(String s) {
		double valueLength = 0;
		String chinese = "[\u4e00-\u9fa5]";
		// 获取字段值的长度，如果含中文字符，则每个中文字符长度为2，否则为1
		for (int i = 0; i < s.length(); i++) {
			// 获取一个字符
			String temp = s.substring(i, i + 1);
			// 判断是否为中文字符
			if (temp.matches(chinese)) {
				// 中文字符长度为1
				valueLength += 1;
			} else {
				// 其他字符长度为0.5
				valueLength += 0.5;
			}
		}
		// 进位取整
		return Math.ceil(valueLength);
	}

	public static boolean equals(String str1, String str2) {
		if (str1 == null || str2 == null) {
			return false;
		} else {
			if (str1.equals(str2)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * null 替换成&nbsp
	 * 
	 * @param str1
	 * @return
	 */
	public static String nullTransToBlank(String str) {
		if (str == null) {
			return new String("&nbsp");
		}
		return str;
	}
	
	
	public static String relpaceSpecialSign(String str, String sign, String repalceStr) {
		if (str != null) {
			String regEx = "["+repalceStr+"]";
			Pattern p = Pattern.compile(regEx);
			Matcher m = p.matcher(str);
			return m.replaceAll(sign).trim();
		}
		return str;
	}

}
