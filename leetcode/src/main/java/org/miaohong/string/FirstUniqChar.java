package org.miaohong.string;


public class FirstUniqChar {

	public static int firstUniqChar(String s) {
		if (s == null || s.length() == 0) {
			return -1;
		}

		int[] CHAR = new int[256];

		for (int i = 0; i < s.length(); i ++) {
			CHAR[s.charAt(i)] ++;
		}

		for (int i = 0, l = s.length(); i < l; i++) {
			if (CHAR[s.charAt(i)] == 1) {
				return i;
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		firstUniqChar("leetcode");
	}

}
