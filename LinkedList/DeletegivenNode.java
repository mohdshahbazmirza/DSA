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
    public ListNode removeElements(ListNode head, int val) {
        
        while(head!=null && head.val==val)
        {
            head=head.next;
        }
        if(head==null)
        {
            return head;
        }
        ListNode start=head;
        ListNode end=head.next;
        while(end!=null)
        {
            if(end.val!=val)
            {
                start.next=end;
                start=end;
            }
            end=end.next; 
        }
        if(start.next!=null)
            start.next=null;
        return head;
        
    }
}