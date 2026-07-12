# Last updated: 12/07/2026, 08:57:37
1class Solution:
2    def secondsBetweenTimes(self, startTime: str, endTime: str) -> int:
3        def to_seconds(time):
4            h,m,s= map(int,time.split(":"))
5            return h*3600 + m*60+s
6        return to_seconds(endTime) - to_seconds(startTime)
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22        
23        