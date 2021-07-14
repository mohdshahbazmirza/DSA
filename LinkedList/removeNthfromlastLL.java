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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        if(head.next==null && n==1)
        {
            return null;
        }
        
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        temp=head;
        int slen=count-n+1;
        if(slen==1)
        {
            return head=head.next;
        }
        for(int i=1;i<slen-1;i++)
            temp=temp.next;
        if(temp.next!=null && temp.next.next!=null)
        temp.next=temp.next.next;
        else temp.next=null;
        return head;
    }
}