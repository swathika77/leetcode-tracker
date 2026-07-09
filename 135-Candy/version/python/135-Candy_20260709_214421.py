# Last updated: 09/07/2026, 21:44:21
1class Solution:
2    def candy(self, ratings: List[int]) -> int:
3        n = len(ratings)
4        total_candies = n
5        i = 1
6
7        while i < n:
8            if ratings[i] == ratings[i - 1]:
9                i += 1
10                continue
11
12            current_peak = 0
13            while i < n and ratings[i] > ratings[i - 1]:
14                current_peak += 1
15                total_candies += current_peak
16                i += 1
17            
18            if i == n:
19                return total_candies
20
21            current_valley = 0
22            while i < n and ratings[i] < ratings[i - 1]:
23                current_valley += 1
24                total_candies += current_valley
25                i += 1
26
27            total_candies -= min(current_peak, current_valley)
28
29        return total_candies