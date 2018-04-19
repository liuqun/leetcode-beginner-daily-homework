package com.leetcode.problem_121;

/** 121: Best time to buy and sell stock */
public class Solution {
	// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
	// https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
	public static int maxProfit(int[] prices) {
		int lowestPriceEver;
		int profit;

		profit = 0;
		lowestPriceEver = Integer.MAX_VALUE;
		for (int price : prices) {
			if (price < lowestPriceEver) {
				lowestPriceEver = price;
			}
			profit = Math.max(profit, price - lowestPriceEver);
		}
		return profit;
	}
}
// vim: fileencoding=utf-8 tabstop=4 shiftwidth=4 noexpandtab
