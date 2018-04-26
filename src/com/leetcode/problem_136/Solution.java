package com.leetcode.problem_136;

import java.util.HashMap;
import java.util.Map.Entry;

/** 136. Single Number https://leetcode.com/problems/single-number/ */
class Solution {
	public int singleNumber(int[] nums) {
		HashMap<Integer, Integer> wc; // (words count)
		wc = new HashMap<Integer, Integer>(nums.length);
		for (int num : nums) {
			if (wc.containsKey(num)) {
				wc.replace(num, 1 + wc.get(num));
			} else {
				wc.put(num, 1);
			}
		}
		if (!wc.containsValue(1)) {
			throw new RuntimeException("No signle number in nums[]!");
		}
		for (Entry<Integer, Integer> i : wc.entrySet()) {
			if (i.getValue() == 1) {
				return (i.getKey().intValue());
			}
		}
		assert false : "The program should never reach here.";
		return (-1);
	}
}
