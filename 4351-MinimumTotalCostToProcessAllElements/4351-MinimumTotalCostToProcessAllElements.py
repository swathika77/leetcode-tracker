# Last updated: 15/07/2026, 15:11:38
class Solution:
    def minimumCost(self, nums: list[int], k: int) -> int:
        MOD = 10**9 + 7
        r = k
        o = 0
        cost = 0
        for x in nums:
            if r < x:
                need = x - r
                add = (need + k - 1) // k
                cost = (cost + add * (2* o + add +1)//2) % MOD
                o += add
                r += add*k
            r -= x
        return cost
        