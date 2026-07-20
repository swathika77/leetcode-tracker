// Last updated: 20/07/2026, 10:14:13
class Solution {
public:
    vector<int> postorderTraversal(TreeNode* root) {
        vector<int>ans;
		if (root == NULL) return ans;
		
		while (root) {
			if (!root->right) {
				ans.push_back(root->val);
				root=root->left;
			}
			
			else {
				TreeNode* cur = root->right;
				
				while (cur->left && cur->left != root) {
					cur = cur->left;
				}
				
				if (cur->left == NULL) {
					ans.push_back(root->val);
					cur->left = root;
					root = root->right;
				}
				else if (cur->left == root) {
					cur->left = NULL;
					root = root->left;
				}
			}
		}
		reverse(ans.begin(),ans.end());
		return ans;
    }
};