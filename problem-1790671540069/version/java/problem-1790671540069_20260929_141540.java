// Last updated: 29/09/2026, 14:15:40
1class Solution {
2    public int sumNumbers(TreeNode root) {
3        return helper(root, 0);
4    }
5
6    int helper(TreeNode node, int current) {
7        if (node == null)
8            return 0;
9
10        current = current * 10 + node.val;
11
12        if (node.left == null && node.right == null)
13            return current;
14
15        return helper(node.left, current) + helper(node.right, current);
16    }
17}