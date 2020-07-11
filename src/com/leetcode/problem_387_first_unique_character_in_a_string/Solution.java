package com.leetcode.problem_387_first_unique_character_in_a_string;
/*
387. 字符串中的第一个唯一字符

给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

示例：
    s = "leetcode"
    返回 0

    s = "loveleetcode"
    返回 2

提示：你可以假定该字符串只包含小写字母。
*/

public class Solution {
	public int firstUniqChar(String s) {
		int slen = s.length();
		if (slen <= 0) {
			return -1;
		}
		char[] str = s.toCharArray();
		Integer ch;
		short i;
		short[] asciiTable = new short[128];
		for (i=0; i<asciiTable.length; i++) {
			asciiTable[i] = -1;
		}
		int[] mylist = new int[slen];
		for (i = 0; i < slen; i++) {
			mylist[i] = i;
		}

		for (i = 0; i < slen; i++) {
			ch = (int) str[i];
			if (asciiTable[ch]>=0) {
				int j = asciiTable[ch];
				mylist[j] = slen;
				mylist[i] = slen;
				continue;
			}
			asciiTable[ch] = i;
		}

		for (i = 0; i < slen; i++) {
			if (mylist[i] < slen) {
				return i;
			}
		}
		return -1;
	}
}
