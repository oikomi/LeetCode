package org.miaohong.string;

public class ReverseString {

	public static String reverseString(String s) {

		if (s == null || s.length() == 0) {
			return s;
		}

		char[] chars = s.toCharArray();

		int left = 0;
		int right = s.length() - 1;
		while (left <= right) {
			char tmp = chars[left];
			chars[left] = chars[right];
			chars[right] = tmp;
			left ++;
			right --;
		}

		return String.valueOf(chars);
	}


	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
	}
}
