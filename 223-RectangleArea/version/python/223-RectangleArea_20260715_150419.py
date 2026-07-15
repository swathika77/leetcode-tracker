# Last updated: 15/07/2026, 15:04:19
1class MyStack:
2    def __init__(self):
3        self.q = deque()
4
5    def push(self, x: int) -> None:
6        self.q.append(x)
7        v = len(self.q) - 1
8        i = 0
9        while i < v:
10            self.q.append(self.q.popleft())
11            i += 1
12
13    def pop(self) -> int:
14        return self.q.popleft()
15
16    def top(self) -> int:
17        return self.q[0]
18
19    def empty(self) -> bool:
20        return len(self.q) == 0