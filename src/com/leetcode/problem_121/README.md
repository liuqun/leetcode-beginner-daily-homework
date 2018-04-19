# 121: Best time to buy and sell stock

```
// Sample code of an inefficient solution
public class Solution {
	public static int maxProfit(int[] prices) {
		int max = 0;
		int i; // buy in price = prices[i]
		int j; // sell out price = prices[j]
		int profit; // profit = prices[j] - prices[i]
		for (i = 0; i < prices.length; i++) {
			for (j = i + 1; j < prices.length; j++) {
				profit = prices[j] - prices[i];
				if (profit > max) {
					max = profit;
				}
			}
		}
		return max;
	}
}
```
