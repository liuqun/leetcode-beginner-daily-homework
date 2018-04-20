# -*- encoding:utf-8 -*-
class Solution:
    """The solution for LeetCode No.53: Maximum Sub-array

    https://leetcode.com/problems/maximum-subarray/
    https://leetcode-cn.com/problems/maximum-subarray/
    """

    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        return max_sub_array(nums)


def max_sub_array(nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    result = nums[0]
    total = 0
    for num in nums:
        total += num
        if total > result:
            result = total
        if total < 0:
            total = 0
    return result


from unittest import TestCase


class SolutionTest(TestCase):
    def test_normal(self):
        self.assertEqual(max_sub_array([-2, 1, -3, 4, -1, 2, 1, -5, 4]), 6)
        self.assertEqual(max_sub_array([-2, 1]), 1)

    def test_negative_numbers(self):
        self.assertEqual(max_sub_array([-1]), -1)
        self.assertEqual(max_sub_array([-1, -2, -3]), -1)
        self.assertEqual(max_sub_array([-2, -1, -3]), -1)
        self.assertEqual(max_sub_array([-2, -3, -1]), -1)
