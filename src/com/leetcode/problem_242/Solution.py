class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        table1 = [0]*(ord('z')+1)
        table2 = [0]*(ord('z')+1)
        for ch in s:
            table1[ord(ch)] += 1
        for ch in t:
            table2[ord(ch)] += 1
        return table1 == table2

# 242. 有效的字母异位词
# 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
#
# 示例 1:
#     输入: s = "anagram", t = "nagaram"
#     输出: true
#
# 示例 2:
#     输入: s = "rat", t = "car"
#     输出: false
#
# 说明:
# 你可以假设字符串只包含小写字母。
#
# 进阶:
# 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
