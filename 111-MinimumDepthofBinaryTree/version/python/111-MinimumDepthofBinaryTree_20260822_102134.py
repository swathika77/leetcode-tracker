# Last updated: 22/08/2026, 10:21:34
1class Solution:
2    def generate(self, numRows: int) -> List[List[int]]:
3        finalNums=[]
4        finalNums.append([1])
5        for i in range(numRows-1):
6            newRow=[1]
7            for j in range(i):
8                newRow.append(finalNums[i][j]+finalNums[i][j+1])
9            newRow.append(1)
10            finalNums.append(newRow)
11        return finalNums