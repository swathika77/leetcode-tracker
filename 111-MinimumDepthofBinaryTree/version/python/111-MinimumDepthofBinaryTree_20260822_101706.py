# Last updated: 22/08/2026, 10:17:06
1class Solution:
2    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
3        if not root:
4            return False
5        
6        if not root.left and not root.right:
7            return targetSum == root.val
8        
9        left_sum = self.hasPathSum(root.left, targetSum - root.val)
10        right_sum = self.hasPathSum(root.right, targetSum - root.val)
11        
12        return left_sum or right_sum