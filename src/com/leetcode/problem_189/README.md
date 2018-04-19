# 189. Rotate Array

Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array `[1,2,3,4,5,6,7]` is rotated to `[5,6,7,1,2,3,4]`.

题目要求不适用额外的数组空间即要求空间复杂度为 O(1)

我探索出一种比较麻烦的解法, 用C语言递归实现, 空间复杂度为O(1), 时间复杂度为O(n): [C代码](Solution.c)
