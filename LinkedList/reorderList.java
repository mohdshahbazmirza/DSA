/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        ListNode temp=head;
        while(temp!=null)
        {
            stack.push(temp);
            temp=temp.next;
        }
        temp=head;
        int i=1;
        int size=stack.size()/2;
        while(i<=size)
        {
            ListNode t=temp.next;
            temp.next=stack.pop();
            temp.next.next=t;
            temp=t;
            i++;
        }
        temp.next=null;
    }
}