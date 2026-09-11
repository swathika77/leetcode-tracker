# Last updated: 11/09/2026, 09:46:05
1class Solution(object):
2    def maximumGap(self, nums):
3        if len(nums) < 2:
4            return 0
5
6        min_num, max_num = min(nums), max(nums)
7        if min_num == max_num:
8            return 0
9
10        gap = max(1, (max_num - min_num) // (len(nums) - 1))
11        buckets = [[None, None] for _ in range((max_num - min_num) // gap + 1)]
12
13        for num in nums:
14            idx = (num - min_num) // gap
15            if buckets[idx][0] is None:
16                buckets[idx][0] = buckets[idx][1] = num
17            else:
18                buckets[idx][0] = min(buckets[idx][0], num)
19                buckets[idx][1] = max(buckets[idx][1], num)
20
21        max_gap = 0
22        prev_max = min_num
23
24        for bucket in buckets:
25            if bucket[0] is not None:
26                max_gap = max(max_gap, bucket[0] - prev_max)
27                prev_max = bucket[1]
28
29        return max_gap