# Last updated: 09/08/2026, 09:07:16
1class Solution:
2    def minPrice(self, prices: list[int], discounts: list[int]) -> float:
3        prices.sort(reverse=True)
4        discounts.sort(reverse=True)
5        total = sum(prices)
6        for i in range(min(len(prices),len(discounts))):
7            total -= prices[i] * discounts[i] / 100
8        return total