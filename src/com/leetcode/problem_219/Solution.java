package com.leetcode.problem_219;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/contains-duplicate-ii/
 */
public class Solution {
	/**
	 * Given an array of integers and an integer k, find out whether there are
	 * two distinct indices i and j in the array such that nums[i] = nums[j] and
	 * the difference between i and j is at most k.
	 * 
	 * @param nums
	 *            The int values.
	 * @param k
	 * @return true if nums[] contains duplicated value, otherwise false.
	 *             When nums.length==0 it returns false.
	 * @throws java.lang.NullPointerException
	 *             When nums==null
	 */
	public static boolean containsDuplicate(int[] nums, int k) {
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>(nums.length);
		int found;
		for (int i=0; i<nums.length; i++) {
			Integer pointer = hashMap.get(nums[i]);
			if (null!=pointer) {
				found = pointer.intValue();
				if (i-found <= k) {
					return true;
				}
				try {
					hashMap.replace(nums[i], i);
				} catch (Exception e) {
					e.printStackTrace();// TODO Auto-generated catch block
					System.exit(-2);
				}
			} else {
				hashMap.put(nums[i], i);
			}
		}
		return false;
	}

}
// vim: fileencoding=utf-8 tabstop=4 shiftwidth=4
