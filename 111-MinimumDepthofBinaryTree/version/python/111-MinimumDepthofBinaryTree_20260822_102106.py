# Last updated: 22/08/2026, 10:21:06
1class Solution:
2    def connect(self, root: 'Node') -> 'Node':
3        if not root:
4            return None
5        q = deque()
6        q.append(root)
7        dummy=Node(-999) # to initialize with a not null prev
8        while q:
9            length=len(q) # find level length
10            
11            prev=dummy
12            for _ in range(length): # iterate through all nodes in the same level
13                popped=q.popleft()
14                if popped.left:
15                    q.append(popped.left)
16                    prev.next=popped.left
17                    prev=prev.next
18                if popped.right:
19                    q.append(popped.right)
20                    prev.next=popped.right
21                    prev=prev.next                
22                 
23        return root