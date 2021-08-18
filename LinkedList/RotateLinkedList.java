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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int n=0;
        ListNode temp=head;
        while(temp.next!=null)
        {
            n++;
            temp=temp.next;
        }
        n++;
        temp.next=head;
        int a=n-(k%n);
        while(a-->0)
        {
             temp=temp.next;
        }
        ListNode res=temp.next;
        temp.next=null;
        return res;
    }
}