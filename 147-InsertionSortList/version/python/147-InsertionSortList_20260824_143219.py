# Last updated: 24/08/2026, 14:32:19
1class Solution:
2    def maxPoints(self, points: list[list[int]]) -> int:
3                                                #   points = [[1,0],[2,1],[3,4], [5,4]]
4
5        points.sort()                           #   point1 point2 (dx,dy)    m     slope                M
6        slope, M = defaultdict(int), 0          #   –––––– –––––– ––––––– –––––––  –––––––––––        –––––
7                                                #   [1,0]  [2,1]   (1,1)   (1,1)   {(1,1):1}            1
8        for i, (x1, y1) in enumerate(points):   #          [3,4]   (2,4)   (1,2)   {(1,1):1,(1,2):1}    1
9                                                #          [5,4]   (4,4)   (1,1)   {(1,1):2,(1,2):1}    2
10            slope.clear()                       #   [2,1]  [3,4]   (1,3)   (1,3)   {(1,3):1}            2
11                                                #          [5,4]   (3,3)   (1,1)   {(1,3):1,(1,1):1}    2
12            for x2, y2 in points[i + 1:]:       #   [3,4]  [5,4]   (3,0)   (1,0)   {(1,0):1}            2
13                dx, dy = x2 - x1, y2 - y1
14                                                #  M + 1 = 2 + 1 = 3 <-- return
15                G = gcd(dx, dy)                 
16                m = (dx//G,dy//G)
17                
18                slope[m] += 1
19                if slope[m] > M: M = slope[m]
20    
21        return M + 1