package com.leetcode.problem_7_reverse_integer;

public class Solution {
    /*
    7. 整数反转
    给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

    示例 1:
        输入: 123
        输出: 321
    示例 2:
        输入: -123
        输出: -321
    示例 3:
        输入: 120
        输出: 21

    注意:
    假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31, 2^31 − 1]。
    请根据这个假设，如果反转后整数溢出那么就返回 0。
    */
    public int reverse(int x) {
        final int MAX_CNT = 10;
        int cnt;
        int i;
        int[] decNums = new int[MAX_CNT];
        long result;
        int sign = 1;
        if (x < 0) {
            x = -x;
            sign = -1;
        }
        cnt = 0;
        while (x > 0) {
            int r = x % 10;
            decNums[cnt++] = r;
            x /= 10;
        }
        result = 0;
        for (i = 0; i < cnt; i++) {
            result *= 10;
            result += decNums[i];
        }
        if (-1 == sign) {
            result = -result;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }
}
