package com.leetcode.problem_121;

/** 121: Best time to buy and sell stock */
public class Solution {
	// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
	// https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
	public static int maxProfit(int[] prices) {
		int i;
		int lowestPriceEver;
		int profit;
		int delta;

		profit = 0;
		lowestPriceEver = Integer.MAX_VALUE;
		for (i = 0; i < prices.length; i++) {
			if (prices[i] < lowestPriceEver) {
				lowestPriceEver = prices[i];
			}
			delta = prices[i] - lowestPriceEver;
			if (delta > profit) {
				profit = delta;
			}
		}
		return profit;
	}
}
// vim: fileencoding=utf-8 tabstop=4 shiftwidth=4 noexpandtab
