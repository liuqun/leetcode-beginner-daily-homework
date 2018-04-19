package com.leetcode.problem_189;

/** 189. Rotate Array */
public class Solution {
	// https://leetcode.com/problems/rotate-array/
	// https://leetcode-cn.com/problems/rotate-array/
	public static void rotate(int[] nums, int k) {
		final int n = nums.length;
		k %= n;
		if (0 == k) {
			return;
		}
		if (k < 0) {
			k += n;
		}

		int i;
		int j;

		int[] buf = new int[n - k];
		for (i = 0; i < buf.length; i++) {
			buf[i] = nums[i];
		}
		for (i = 0, j = n - k; j < n; i++, j++) {
			nums[i] = nums[j];
		}
		for (int x : buf) {
			nums[i++] = x;
		}
	}
}
// vim: fileencoding=utf-8 tabstop=4 shiftwidth=4 noexpandtab
