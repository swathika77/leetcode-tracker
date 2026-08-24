// Last updated: 24/08/2026, 15:47:36
1class Solution {
2    public int maxProfit(int[] prices) {
3        int buy = prices[0];
4        int profit = 0;
5        for (int i = 1; i < prices.length; i++) {
6            if (prices[i] < buy) {
7                buy = prices[i];
8            } else if (prices[i] - buy > profit) {
9                profit = prices[i] - buy;
10            }
11        }
12        return profit;
13    }
14}