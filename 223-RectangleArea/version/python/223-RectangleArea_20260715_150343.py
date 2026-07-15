# Last updated: 15/07/2026, 15:03:43
1class Solution:
2  def calculate(self, s: str) -> int:
3    ans = 0
4    num = 0
5    sign = 1
6    stack = [sign]  # stack[-1]: current env's sign
7
8    for c in s:
9      if c.isdigit():
10        num = num * 10 + (ord(c) - ord('0'))
11      elif c == '(':
12        stack.append(sign)
13      elif c == ')':
14        stack.pop()
15      elif c == '+' or c == '-':
16        ans += sign * num
17        sign = (1 if c == '+' else -1) * stack[-1]
18        num = 0
19
20    return ans + sign * num