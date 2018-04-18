package com.leetcode.problem_169;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * https://leetcode.com/problems/majority-element/
 */
public class Solution {
	/**
	 * @param nums Contains at least 1 int element and contains major element.
	 * @return The majority element which should >50% and <=100%
	 * @throws java.lang.NullPointerException When null==nums .
	 * @throws java.lang.IllegalArgumentException When failed to find the major(>50%) in nums[], or 0==nums.length . ==50% excluded.
	 * @throws java.lang.RuntimeException() Only for a fallback-safety check.
	 */
	public static int majorityElement(/*@NonNull*/ int[] nums) {
		HashMap<Integer, Integer> hashMap;
		assert(null!=nums);
		assert(nums.length>0);// FIXME: 遇到零长数组时断言退出，并未显式抛出异常
		hashMap = new HashMap<Integer, Integer>(nums.length);
		final Integer DEFAULT=0;
		for (int key : nums) {
			hashMap.put(key, hashMap.getOrDefault(key, DEFAULT)+1);
		}
		Collection<Integer> c = hashMap.values();
		assert(!c.isEmpty());
		Integer max = Collections.max(c);// 元素出现次数
		assert(null!=max);
		if (null==max || max*2<=nums.length) {// Note: 题目已知主要元素的出现频率不允许<=50%.
			throw new java.lang.IllegalArgumentException();
		}
		Integer major=null;
		Set<HashMap.Entry<Integer, Integer>> set=hashMap.entrySet();
		for (HashMap.Entry<Integer, Integer> pair : set) {
			if (max.equals(pair.getValue())) {
				major = pair.getKey();
				break;
			}
		}
		assert(null!=major);
		if (null==major) {// Note: for fallback-safety only.
			throw new java.lang.RuntimeException();
		}
		return (major.intValue());
	}
	/**{@link #majorityElement(int[])}版本2.
	 * 排序后可以直接取中间位置元素作为majority值.
	 * @throws java.lang.NullPointerException When null==nums .
	 * @deprecated Because it do NOT throw IllegalArgumentException When actually there is NO any element that appears up to 50% of nums[].
	 */
	public static int majorityElement_v2_deprecated(/*@NonNull*/ int[] nums) {
		java.util.Arrays.sort(nums);
		return (nums[nums.length/2]);// FIXME: 无法识别不存在majority元素的数组例如{1,2,1,2}
	}
	/**{@link #majorityElement(int[])}版本3.
	 * 参考网友JD思路的v3特殊解法.
	 * https://m.yhspy.com/read.php?id=143
	 * @throws java.lang.NullPointerException When null==nums .
	 * @throws java.lang.IllegalArgumentException When failed to find the major(>50%) in nums[], or 0==nums.length . ==50% excluded.
	 * @deprecated Because it do NOT throw IllegalArgumentException When actually there is NO any element that appears up to 50% of nums[].
	 */
	public static int majorityElement_v3_deprecated(/*@NonNull*/ int[] nums) {
		int i;
		int mark_i;
		int count;
		for (i=1,mark_i=0,count=1; i<nums.length; i++) {
			if (count<=0) {
				mark_i = i;
				count++;
				/*continue;*/
			} else if (nums[i] != nums[mark_i]) {
				count --;
			} else {
				count ++;
			}
		}
		if (0==count) {// Note: 必须大于50%，不能==50%
			throw new IllegalArgumentException();
		}
		if (0==nums.length) {
			throw new IllegalArgumentException();
		}
		assert(mark_i<=nums.length);
		return nums[mark_i];// FIXME: 无法识别不存在majority元素的数组例如{1,2,1,2}
	}

}
// vim: fileencoding=utf-8 tabstop=4 shiftwidth=4 noexpandtab
