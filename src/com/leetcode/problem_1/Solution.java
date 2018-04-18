/**
 * @file Solution.java
 * -------------------
 * 题目:
 * 给定一个整数数组int nums[]和一个目标值target，
 * 要求从数组中找出2个成员的算数和恰好等于目标值target
 * 函数返回值要求是两个数组成员的下标(题目要求起始下标从0开始)
 * 若找不到满足要求的两个数组成员，则抛出一个参数异常，避免访问数组下标越界
 * 英文原题:
 * @url http://leetcode.com/problems/two-sum/
 * 解法:
 * HashMap快速查找法
 * -------------------
 * 解题者:
 * @author 刘群<517067180@qq.com>
 */
package com.leetcode.problem_1;

import java.util.HashMap;

/**
 * Framwork class only used to solve LeetCode problem.
 * URL http://leetcode.com/problems/two-sum/
 */
public class Solution {
	/**
	 * Two-sum problem solver method
	 * ----------------------
	 * @param nums Which contents at least 2 elements
	 * @param target The specific target
	 * @return Zero-based indices of the two numbers that added up to the specific target
	 * @throws java.lang.IllegalArgumentException When no answer is found, or nums do not contents at least 2 elements
	 */
	public static int[] twoSum(int[] nums, int target) throws IllegalArgumentException {
		int i, j;
		int delta;
		HashMap<Integer, Integer> map;
		final int LENGTH = nums.length;
		map = new HashMap<Integer, Integer>(LENGTH);
		for (i = 0; i < LENGTH; i++) {
			delta = target - nums[i];
			if (map.containsKey(delta)) {
				j = (Integer) map.get(delta);
				return (new int[]{j, i});
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	/**
	 * Wapper method of {@link #twoSum(int[], int)}, used to convert Integer[] nums into int[] nums.
	 * @param nums Original Interger[] array that contents at least 2 elements,
	 *             see {@link #twoSum(int[], int) twoSum(nums, target)}
	 * @param target See {@link #twoSum(int[], int) twoSum(nums, target)}.
	 * @return See return value of {@link #twoSum(int[], int)}.
	 * @throws java.lang.IllegalArgumentException See exceptions of {@link #twoSum(int[], int)}.
	 */
	public static int[] twoSum(Integer[] nums, int target) throws IllegalArgumentException {
		final int length = nums.length;
		int a[] = new int[length];
		for (int i = 0; i < length; i++) {
			a[i] = nums[i].intValue();
		}
		return (twoSum(a, target));
	}
}
// vim: fileencoding=utf-8 tabstop=4 shiftwidth=4 noexpandtab
