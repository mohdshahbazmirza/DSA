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
    public boolean isPalindrome(ListNode head) {
        
        if(head.next==null)
            return true;
        if(head.next.next==null)
            if(head.val==head.next.val)
                return true;
            else
                return false;
        ListNode temp1=head;
        ListNode temp2=head.next.next;
        while(temp2!=null && temp2.next!=null)
        {
            temp1=temp1.next;
            temp2=temp2.next.next;
        }
        temp2=temp1.next;
        temp1.next=null;
        temp1=head;
        ListNode temp3=temp2.next;
        while(temp3!=null)
        {
            ListNode temp=temp3.next;
            temp3.next=temp2;
            temp2=temp3;
            temp3=temp;
        }
        while(temp1!=null)
        {
            if(temp1.val!=temp2.val)
                return false;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }
}