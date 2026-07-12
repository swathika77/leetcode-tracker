# Last updated: 12/07/2026, 09:18:36
1class Solution:
2    def minimumCost(self, nums: list[int], k: int) -> int:
3        MOD = 10**9 + 7
4        r = k
5        o = 0
6        cost = 0
7        for x in nums:
8            if r < x:
9                need = x - r
10                add = (need + k - 1) // k
11                cost = (cost + add * (2* o + add +1)//2) % MOD
12                o += add
13                r += add*k
14            r -= x
15        return cost
16        