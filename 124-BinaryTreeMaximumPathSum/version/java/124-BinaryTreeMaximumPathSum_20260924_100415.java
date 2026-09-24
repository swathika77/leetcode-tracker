// Last updated: 24/09/2026, 10:04:15
1class Solution {
2    int ans = Integer.MIN_VALUE;
3    
4    public int maxPathSum(TreeNode root) {
5        helper(root);
6        return ans;
7    }
8
9    int helper(TreeNode node) {
10        if (node == null) return 0;
11
12        // Get left and right max path sum; ignore negative paths
13        int left = Math.max(helper(node.left), 0);
14        int right = Math.max(helper(node.right), 0);
15
16        // Compute the path sum passing through current node
17        int pathSum = node.val + left + right;
18        
19        // Update global max
20        ans = Math.max(ans, pathSum);
21
22        // Return max gain including current node to parent
23        return node.val + Math.max(left, right);
24    }
25}