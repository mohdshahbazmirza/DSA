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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return head;
        ListNode b=head;
        ListNode f=head.next;
        while(f!=null)
        {
            while(f.next!=null&&b.val==f.val)
            {
                f=f.next;
            }
            if(f.next==null && b.val==f.val)
            {
                b.next=null;
                break;
            }
            else
            {
                b.next=f;
            f=f.next;
            b=b.next;    
            }
            
        }
        return head;
        
    }
}