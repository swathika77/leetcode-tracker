// Last updated: 20/07/2026, 15:41:15
1/**
2 * Definition for a binary tree node.
3 * struct TreeNode {
4 *     int val;
5 *     TreeNode *left;
6 *     TreeNode *right;
7 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
8 * };
9 */
10
11class Solution {
12public:
13    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
14        if (root == NULL)
15            return NULL;
16
17        if (p->val < root->val && root->val < q->val)
18            return root;
19
20        if (p->val > root->val && root->val > q->val)
21            return root;
22
23        if (root->val == p->val || root->val == q->val)
24            return root;
25
26        if (p->val < root->val || q->val < root->val)
27            return lowestCommonAncestor(root->left, p, q);
28
29        if (p->val > root->val || q->val > root->val)
30            return lowestCommonAncestor(root->right, p, q);
31
32        return NULL;
33    }
34};