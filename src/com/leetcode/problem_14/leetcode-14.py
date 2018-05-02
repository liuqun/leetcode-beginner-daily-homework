# -*-coding:utf-8 -*-
class Solution:
    """Solution for LeetCode problem No.14: Longest Common Prefix

    LeetCode 第 14 题: 求最长公共前缀
    原题网址: https://leetcode-cn.com/problems/longest-common-prefix/
    """

    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        return longest_common_prefix(strs)


def longest_common_prefix(strs):
    """
    :type strs: List[str]
    :rtype: str
    """
    if len(strs) <= 0:
        return ''

    s = strs[0]

    # 此处采用二分法找出公共前缀
    result = ''
    n_max = len(s)
    n = int((n_max + 1) / 2)
    n_min = 0
    while n_min < n <= n_max:
        prefix = s[:n]
        found_common = True
        for word in strs[1:]:
            if not word.startswith(prefix):
                found_common = False
                break
        if found_common:
            result = prefix
            n_min = n
        else:
            n_max = n - 1
        n = int((n_min + n_max + 1) / 2)
    return result


from unittest import TestCase


class SolutionTest(TestCase):
    @staticmethod
    def test_default():
        assert longest_common_prefix([]) == ''
        assert longest_common_prefix(['dog', 'racecar', 'car']) == ''
        assert longest_common_prefix(['flower', 'flow', 'flight']) == 'fl'


if '__main__' == __name__:
    from os.path import abspath
    try:
        from pytest import main

        main(['-q', abspath(__file__)])
    except ImportError as err:
        from unittest import main

        main()
