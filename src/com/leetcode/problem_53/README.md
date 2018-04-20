# 53. Maximum Subarray

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

**Example:**
```
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
```

From: https://leetcode.com/problems/maximum-subarray/


# 53. 求连续子数组之和的最大值

给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

**示例:**
```
输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
```

**进阶:**

如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。

本题内容源自LeetCode（中国）官方网站: https://leetcode-cn.com/problems/maximum-subarray/


# 我的解答
- Python 样例代码及单元测试用例: [leetcode-53.py](leetcode-53.py)

# 测试用例注意事项
1. 输入数据可能全为负数！此情况下正确答案应取最接近0的负数。
