# Last updated: 29/09/2026, 14:05:22
1class Solution:
2    def longestConsecutive(self, nums: List[int]) -> int:
3        num_set = set(nums)
4        length = 0
5        for start in num_set:
6            if start - 1 not in num_set:
7                end = start + 1
8                while end in num_set:
9                    end += 1
10                length = max(length, end - start)
11        return length