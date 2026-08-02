# Last updated: 02/08/2026, 09:16:10
1from math import gcd
2class Solution:
3    def maxPairStrength(self, nums: list[int]) -> int:
4        n = len(nums)
5        ans = 0
6        for i in range(n):
7            for j in range(i + 1,n):
8                g = gcd(nums[i], nums[j])
9                strength = (nums[i] * nums[j]) // (g*g)
10                ans = max(ans, strength)
11        return ans