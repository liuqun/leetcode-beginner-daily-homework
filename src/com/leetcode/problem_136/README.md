# 136. Single Number
Given a **non-empty** array of integers, every element appears twice except for one. Find that single one.

**Note:**

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

**Example 1:**
```
Input: [2,2,1]
Output: 1
```

**Example 2:**
```
Input: [4,1,2,1,2]
Output: 4
```

# 一种解法
```
/* 一种基于HashSet的解法 */

import java.util.HashSet;

class Solution {
	public int singleNumber(int[] nums) {
		HashSet<Integer> s = new HashSet<Integer>();

		for (int num : nums) {
			if (s.contains(num)) {
				s.remove(num);
			} else {
				s.add(num);
			}
		}
		for (Integer result : s) {
			return (result.intValue());
		}
		if (s.isEmpty()) {
			throw new RuntimeException("No signle number in nums[]!");
		}
		assert false : "The program should never reach here.";
		return (-1);
	}
}
```
