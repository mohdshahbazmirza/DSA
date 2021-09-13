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
    int val1;
    boolean flag=true;
    public void preorder(TreeNode root)
    {
        if(root==null)
            return;
        if(root.val!=val1)
            flag=false;
        preorder(root.left);
        preorder(root.right);
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return false;
        val1=root.val;
        preorder(root);
        return flag;
        
        
    }
}
