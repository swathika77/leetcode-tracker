# Last updated: 09/10/2026, 09:23:00
class Solution:
    def countRatioSubarrays(self, nums: list[int], a: int, b: int) -> int:
        ans = 0
        n = len(nums)
        for i in range(n):
            e = 0
            o = 0
            for j in range(i,n):
                if nums[j] % 2 == 0:
                    e += 1
                else:
                    o += 1
                if o > 0 and e * b <= o * a:
                    ans += 1
        return ans