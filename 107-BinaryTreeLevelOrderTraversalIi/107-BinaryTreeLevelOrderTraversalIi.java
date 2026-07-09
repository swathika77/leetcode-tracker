// Last updated: 09/07/2026, 10:07:46
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private void inorder(TreeNode root,List<List<Integer>> al,int level){
        if(root==null)return;
        if(al.size()==level){
            al.add(new ArrayList<Integer>());
        }
        al.get(level).add(root.val);
        inorder(root.left,al,level+1);
        inorder(root.right,al,level+1);
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> al=new ArrayList<>();
        inorder(root,al,0);
        int i=0,j=al.size()-1;
        while(i<j){
            List<Integer> al2=al.get(i);
            List<Integer> al3=al.get(j);
            al.set(i,al3);
            al.set(j,al2);
            i++;
            j--;
        }
        return al;
    }
}