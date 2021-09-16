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
    
    public boolean symmetric(TreeNode p, TreeNode q)
    {
        if(p==null && q==null)
        {
            return true;
        }
        else if(p==null || q==null)
        {
            return false;
        }
        else if(p.val!=q.val)
        {
            return false;
        }
            
        return symmetric(p.left,q.right)&&symmetric(p.right,q.left);
        
    }
    public boolean isSymmetric(TreeNode root) {
            if(root==null) return false;
            return symmetric(root.left,root.right);
    }
}
