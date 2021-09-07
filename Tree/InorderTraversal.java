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
    
    public List<Integer> inorderTraversal(TreeNode root)
    {
        List<Integer> al=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode current=root;
        //st.push(current);
        while(true)
        {
             if(current!=null)
             {
                 st.push(current);
                 current=current.left;
             }
             else
             {
                 if(st.isEmpty()){
                     return al;
                 }
                 else{
                        current=st.pop();
                        al.add(current.val);
                        current=current.right;
                 }
             }
        }
        //return al;
    }
    /*public void traverse(List<Integer> al, TreeNode root)
    {
        if(root==null)
            return;
        traverse(al,root.left);
        al.add(root.val);
        traverse(al,root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> al=new ArrayList<>();
        traverse(al,root);
        return al;
    }*/
}
