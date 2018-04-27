package com.leetcode.problem_349;

import java.util.HashSet;
import java.util.Set;

/// 题目349. 两个数组的交集: [题目链接](https://leetcode-cn.com/problems/intersection-of-two-arrays)
class Solution {
	private Set<Integer> intersection_(int[] nums1, int[] nums2) {
		Set<Integer> s1;
		Set<Integer> s2;

		s1 = new HashSet<Integer>(nums1.length);
		for (int word : nums1) {
			s1.add(word);
		}
		s2 = new HashSet<Integer>(nums2.length);
		for (int word : nums2) {
			s2.add(word);
		}
		s2.retainAll(s1);
		return (s2);
	}

	public int[] intersection(int[] nums1, int[] nums2) {
		int[] result;
		int i;
		Set<Integer> result_;

		result_ = intersection_(nums1, nums2);
		result = new int[result_.size()];
		i = 0;
		for (int v : result_) {
			result[i++] = v;
		}
		return (result);
	}
}
