# Last updated: 22/08/2026, 10:17:50
1# Definition for a binary tree node.
2# class TreeNode:
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7
8class Solution:
9    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> List[List[int]]:
10        ans = []
11
12        if root is None:
13            return []
14
15        def helper(root, res):
16            if root.left is None and root.right is None:
17                res.append(root.val)
18
19                if sum(res) == targetSum:
20                    ans.append(res.copy())
21
22                return
23
24            res.append(root.val)
25
26            if root.left:
27                helper(root.left, res.copy())
28
29            if root.right:
30                helper(root.right, res.copy())
31
32        helper(root, [])
33        return ans