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
        public List<Integer> postorderTraversal(TreeNode root) {
            
            List<Integer> list=new ArrayList<>();
            Stack<TreeNode> st1=new Stack<>();
            Stack<TreeNode> st2=new Stack<>();
            if(root==null)
                return list;
            st1.push(root);
            while(!st1.empty())
            {
                root=st1.pop();
                st2.push(root);
                if(root.left!=null) st1.push(root.left);
                if(root.right!=null) st1.push(root.right);
                
            }
            while(!st2.empty())
                list.add(st2.pop().val);
            
            return list;
            
        }
    /*public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode head=root;
        //st.push(root);
        while(head!=null || !st.empty())
        {
            if(head!=null){
                st.push(head);
                head=head.left;
            }
            else 
            {
                TreeNode temp=st.peek().right;
                if(temp==null)
                {
                    temp=st.pop();
                    list.add(temp.val);
                    while(!st.empty() && st.peek().right==temp)
                    {
                        temp=st.pop();
                        list.add(temp.val);       
                    }
                }
                else
                {
                    head=temp;
                }
                
            }
        }
        return list;
        
    }*/
    
    /*public void postorder(List<Integer> list, TreeNode root)
    {
        if(root==null)
            return;
        postorder(list,root.left); 
        postorder(list,root.right);
        list.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> list=new ArrayList<>();
        postorder(list,root);
        return list;
    }*/
}
