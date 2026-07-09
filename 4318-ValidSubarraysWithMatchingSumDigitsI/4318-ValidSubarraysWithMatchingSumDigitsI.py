# Last updated: 09/07/2026, 10:06:34
class Solution(object):
    def countValidSubarrays(self, nums, x):
        n = len(nums)
        ans = 0
        for i in range(n):
              s = 0
              for j in range(i , n):
                    s += nums[j]
                    if s % 10 != x:
                         continue
                    first = int(str(s)[0])
                    if first == x:
                          ans += 1
        return ans
            