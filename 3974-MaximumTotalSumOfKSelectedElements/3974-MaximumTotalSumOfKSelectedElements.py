# Last updated: 09/10/2026, 09:22:52
class Solution:
    def maxSum(self, nums: list[int], k: int, mul: int) -> int:
        nums.sort(reverse=True)
        w= [max(1, mul - i) for i in range(k)]
        w.sort(reverse=True)
        ans = 0
        for i in range(k):
            ans += nums[i] * w[i]
        return ans
        