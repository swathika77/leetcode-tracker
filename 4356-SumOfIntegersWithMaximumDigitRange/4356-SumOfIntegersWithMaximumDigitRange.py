# Last updated: 09/07/2026, 10:06:30
class Solution:
    def maxDigitRange(self, nums: list[int]) -> int:
        max_range = -1
        ans = 0
        for num in nums:
            mn = 9
            mx = 0
            x = num
            while x > 0:
                d = x%10
                mn = min(mn,d)
                mx = max(mx,d)
                x //= 10
            diff = mx - mn
            if diff > max_range:
                max_range = diff
                ans = num
            elif diff == max_range:
                ans += num
        return ans
        