# Last updated: 09/10/2026, 09:22:33
from math import gcd
class Solution:
    def maxPairStrength(self, nums: list[int]) -> int:
        n = len(nums)
        ans = 0
        for i in range(n):
            for j in range(i + 1,n):
                g = gcd(nums[i], nums[j])
                strength = (nums[i] * nums[j]) // (g*g)
                ans = max(ans, strength)
        return ans