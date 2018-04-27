package com.leetcode.problem_350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/// 题目350. 两个数组的交集 II: [题目链接](https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/)
class Solution {
	private List<Integer> intersect_(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> wc; // word count

		wc = new HashMap<Integer, Integer>(nums1.length);
		for (int word : nums1) {
			if (wc.containsKey(word)) {
				wc.replace(word, 1 + wc.get(word));
			} else {
				wc.put(word, 1);
			}
		}

		List<Integer> result;

		result = new ArrayList<Integer>(Math.min(nums1.length, nums2.length));
		for (Integer k : nums2) {
			if (!wc.containsKey(k)) {
				continue;
			}

			result.add(k);

			Integer left = wc.get(k);
			left--;
			if (left <= 0) {
				wc.remove(k);
			} else {
				wc.replace(k, left);
			}
		}

		return (result);
	}

	public int[] intersect(int[] nums1, int[] nums2) {
		int[] result;
		List<Integer> result_;

		result_ = intersect_(nums1, nums2);
		result = new int[result_.size()];
		for (int i = 0; i < result_.size(); i++) {
			result[i] = result_.get(i).intValue();
		}
		return (result);
	}
}
