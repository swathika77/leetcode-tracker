# Last updated: 22/08/2026, 10:18:34
1class Solution:
2    def numDistinct(self, s: str, t: str) -> int:
3        n, m = len(s), len(t)
4        dp = [0] * (m + 1)
5        dp[0] = 1  # empty t
6
7        for i in range(1, n + 1):
8            for j in range(m, 0, -1):
9                if s[i - 1] == t[j - 1]:
10                    dp[j] += dp[j - 1]
11
12        return dp[m]