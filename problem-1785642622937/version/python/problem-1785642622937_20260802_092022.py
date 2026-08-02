# Last updated: 02/08/2026, 09:20:22
1class Solution:
2    def countRatioSubarrays(self, nums: list[int], a: int, b: int) -> int:
3        ans = 0
4        n = len(nums)
5        for i in range(n):
6            e = 0
7            o = 0
8            for j in range(i,n):
9                if nums[j] % 2 == 0:
10                    e += 1
11                else:
12                    o += 1
13                if o > 0 and e * b <= o * a:
14                    ans += 1
15        return ans