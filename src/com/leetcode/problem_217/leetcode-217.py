# -*- encoding:utf-8 -*-
class Solution:
    """The solution for LeetCode No.217: Contains Duplicate

    https://leetcode.com/problems/contains-duplicate/
    https://leetcode-cn.com/problems/contains-duplicate/
    """

    def containsDuplicate(self, nums):
        """(Wrapper method for LeetCode online judge only)

        :type nums: List[int]
        :rtype: bool
        """
        return contains_duplicate(nums)


def contains_duplicate(nums):
    """
    :type nums: List[int]
    :rtype: bool
    """
    return len(nums) > len(set(nums))


from unittest import TestCase


class SolutionTest(TestCase):
    def test_contains_duplicate(self):
        assert not contains_duplicate([])
        assert not contains_duplicate([1])
        assert not contains_duplicate([1, 2])
        assert contains_duplicate([1, 1])
        assert contains_duplicate([1, 1, 1])
        assert contains_duplicate([1, 1, 2])
        assert contains_duplicate([1, 2, 1])
        assert contains_duplicate([1, 2, 2])
        assert not contains_duplicate([1, 2, 3])


if '__main__' == __name__:
    from os.path import abspath
    import pytest

    pytest.main(['-q', abspath(__file__)])
