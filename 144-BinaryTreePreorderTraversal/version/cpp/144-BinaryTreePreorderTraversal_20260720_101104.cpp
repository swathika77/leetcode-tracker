// Last updated: 20/07/2026, 10:11:04
1class Solution {
2public:
3    vector<int> postorderTraversal(TreeNode* root) {
4        vector<int>ans;
5		if (root == NULL) return ans;
6		
7		while (root) {
8			if (!root->right) {
9				ans.push_back(root->val);
10				root=root->left;
11			}
12			
13			else {
14				TreeNode* cur = root->right;
15				
16				while (cur->left && cur->left != root) {
17					cur = cur->left;
18				}
19				
20				if (cur->left == NULL) {
21					ans.push_back(root->val);
22					cur->left = root;
23					root = root->right;
24				}
25				else if (cur->left == root) {
26					cur->left = NULL;
27					root = root->left;
28				}
29			}
30		}
31		reverse(ans.begin(),ans.end());
32		return ans;
33    }
34};