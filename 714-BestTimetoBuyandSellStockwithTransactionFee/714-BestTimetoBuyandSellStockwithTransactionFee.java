// Last updated: 9/2/2026, 11:45:52 AM
1class Solution {
2    public int maxProfit(int[] prices, int fee) {
3        int buy = Integer.MIN_VALUE;
4        int sell = 0;
5
6        for (int price : prices) {
7            buy = Math.max(buy, sell - price);
8            sell = Math.max(sell, buy + price - fee);
9        }
10
11        return sell;
12    }
13}