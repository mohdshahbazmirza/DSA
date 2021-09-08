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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root==null)
            return list;
        st.push(root);
        while(!st.empty())
        {
             root=st.pop();
            list.add(root.val);
            if(root.right!=null) st.push(root.right);
            if(root.left!=null) st.push(root.left);
        }
        return list;
    }
    /*public void preorder(List<Integer> list, TreeNode root)
    {
        if(root==null)
            return;
        list.add(root.val);
        preorder(list,root.left);
        preorder(list,root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> list=new ArrayList<>();
        preorder(list,root);
        return list;
        
    }*/
}
