// Last updated: 15/07/2026, 15:09:41
1class Solution {
2
3    private int count = 0;
4    private int res = 0;
5
6    public int kthSmallest(TreeNode root, int k) {
7        inorder(root, k);
8        return res;
9    }
10
11    private void inorder(TreeNode node, int k) {
12        if (node == null)
13            return;
14
15        inorder(node.left, k);
16
17        count++;
18        if (count == k) {
19            res = node.val;
20            return;
21        }
22
23        inorder(node.right, k);
24    }
25}