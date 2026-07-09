# Last updated: 09/07/2026, 10:06:55
class Solution:
    def filterOccupiedIntervals(self, occupiedIntervals: List[List[int]], freeStart: int, freeEnd: int) -> List[List[int]]:
        occupiedIntervals.sort()
        merged = []
        for s , e in occupiedIntervals:
            if not merged or s > merged[-1][1] + 1:
                merged.append([s,e])
            else:
                merged[-1][1]= max(merged[-1][1], e)
        ans= []
        for s,e in merged:
            if e < freeStart or s > freeEnd:
                ans.append([s,e])
            else:
                if s < freeStart:
                    ans.append([s,freeStart - 1])
                if e > freeEnd:
                    ans.append([freeEnd + 1, e])
        return ans