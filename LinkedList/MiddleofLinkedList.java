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
    public ListNode middleNode(ListNode head) {
        ListNode start=head;
        ListNode end=head;
        int length=0;
        while(end!=null){
            end=end.next;
            length++;
        }
        for(int i=0;i<length/2;i++)
        {
            start=start.next;
        }
        return start;
        
    }
}