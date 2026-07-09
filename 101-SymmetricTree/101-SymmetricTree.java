// Last updated: 09/07/2026, 10:07:59
class Solution {
    public boolean isTreeSymmetric(TreeNode leftRoot, TreeNode rightRoot){
        if(leftRoot == null && rightRoot == null)
            return true;
        if((leftRoot == null && rightRoot != null)  || (leftRoot != null && rightRoot == null))
            return false;
        if(leftRoot.val != rightRoot.val)
            return false;
        return isTreeSymmetric(leftRoot.left, rightRoot.right) && isTreeSymmetric(leftRoot.right, rightRoot.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return isTreeSymmetric(root.left, root.right);
    }
}