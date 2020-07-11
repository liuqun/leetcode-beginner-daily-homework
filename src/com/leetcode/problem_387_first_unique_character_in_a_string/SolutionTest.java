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

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest extends Solution {
	@Test
	public void runBasicTests() {
		assertEquals(firstUniqChar("cc"), -1);
		assertEquals(firstUniqChar("leetcode"), 0);
		assertEquals(firstUniqChar("loveleetcode"), 2);
	}
	
	@Test
	public void runEmptyStringTest() {
		assertEquals(firstUniqChar(""), -1);
	}
}
