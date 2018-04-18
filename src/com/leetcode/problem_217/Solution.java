package com.leetcode.problem_217;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/contains-duplicate/
 */
public class Solution {
	/**
	 * @param nums The int values.
	 * @return true if nums[] contains duplicated value, otherwise false.
	 * When nums.length==0 it returns false.
	 * @throws java.lang.NullPointerException when nums==null
	 */
	public static boolean containsDuplicate(/*@NonNull*/ int[] nums) {
		Map<Integer, Object> hashMap = new HashMap<Integer, Object>(nums.length);
		for (int i : nums) {
			if (hashMap.containsKey(i)) {
				return true;
			}
			hashMap.put(i, null);
		}
		return false;
	}
	/**
	 * containsDuplicate_v2版本速度比{@link #containsDuplicate(int[])}更快
	 * @param nums
	 * @return
	 */
	public static boolean containsDuplicate_v2(/*@NonNull*/ int[] nums) {
		Map<Integer, Object> hashMap = new HashMap<Integer, Object>(nums.length);
		for (int i : nums) {
			hashMap.put(i, null);
		}
		return (nums.length>hashMap.size());
	}

}
// vim: fileencoding=utf-8 tabstop=4 shiftwidth=4 noexpandtab
