package com.leetcode.problem_283;

public class Solution {
	public static void moveZeroes(int[] nums) {
		int i, j; // 数组下标

		/* 数组开头的i个非零元素不需要移动 */
		for (i = 0; i < nums.length && nums[i] != 0; i++) {
		}
		/* 每圈只移动一个非零元素，让下标i指向目的地，让下标j指向下一个非零元素 */
		j = i + 1;
		MAIN_LOOP: while (j < nums.length) {
			int k = j;
			while (0 == nums[k]) {
				++k;
				if (k >= nums.length) {
					break MAIN_LOOP;
				}
			}
			j = k;
			nums[i++] = nums[j++];
		}
		/* 末尾补零 */
		final int indexFromFirst = i;// (inclusive)
		final int indexToLast = nums.length;// (exclusive)
		java.util.Arrays.fill(nums, indexFromFirst, indexToLast, 0);
		return;
		/**
		 * 建议测试用例1:数组长度=1 
		 * 建议测试用例2:数组长度>=2，数组内容不含0或内容全部=0 
		 * 建议测试用例3:数组长度>=2，数组内容含有一串或多串连续的0
		 *              {0, 1, 0} ==> {1, 0, 0}
		 */
	}

}
//vim: fileencoding=utf-8 tabstop=4 shiftwidth=4
