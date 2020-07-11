# encoding:utf-8
from __future__ import print_function

def find_first_uniq_char_of(s:str) -> int:
    slen = len(s)
    ascii_tbl = [None] * (ord('z')+1) # 此空间足以存放 ASCII 码表的'a'-'z'部分即可
    mylist = [j for j in range(slen)]
    for i in range(slen):
        ch = ord(s[i])
        i_prev = ascii_tbl[ch]
        if i_prev is None:
            ascii_tbl[ch] = i
            continue
        mylist[i_prev] = slen
        mylist[i] = slen
    for j in mylist:
        if j < slen:
            return j
    return -1

class Solution:
    def firstUniqChar(self, s: str) -> int:
        return find_first_uniq_char_of(s)


if '__main__' == __name__:
    s = Solution()
    ret = s.firstUniqChar('loveleetcode')
    print(ret)

# https://leetcode-cn.com/problems/first-unique-character-in-a-string/

__doc__ = """
387. 字符串中的第一个唯一字符
给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

示例：
    s = "leetcode"
    返回 0

    s = "loveleetcode"
    返回 2

提示：你可以假定该字符串只包含小写字母。
"""

