# Last updated: 16/08/2026, 09:29:51
1class Solution:
2    def nearestDrone(self, drones: list[list[int]], target: list[int]) -> int:
3        m = float('inf')
4        a = -1
5        for i in range(len(drones)):
6            x,y,r = drones[i]
7            dist = abs(x - target[0]) + abs(y - target[1])
8            if dist <= r:
9                if dist < m:
10                    m = dist
11                    a = i
12        return a