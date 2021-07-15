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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1=l1;
        ListNode list2=l2;
        ListNode node=new ListNode(-1,null);
        ListNode list=node;
        int r=0;
        while(list1!=null || list2!=null)
        {
            if(list1!=null && list2!=null)
            {
                int a=list1.val+list2.val+r;
                if(a<=9)
                {
                    list.next=new ListNode(a,null);
                    list=list.next;
                    r=0;
                }

                else
                {
                    list.next=new ListNode(a%10,null);
                    r=1;
                    list=list.next;
                }
                list1=list1.next;
                list2=list2.next;    
            }
            else if(list1!=null && list2==null)
            {
                if((list1.val+r)<=9)
                {
                    list.next=new ListNode(list1.val+r,null);
                    list=list.next;
                    r=0;
                }
                else
                {
                    list.next=new ListNode((list1.val+r)%10,null);
                    list=list.next;
                    r=1;
                }
                list1=list1.next;
            }
            else if(list2!=null && list1==null)
            {
                if((list2.val+r)<=9)
                {
                    list.next=new ListNode(list2.val+r,null);
                    list=list.next;
                    r=0;
                }
                else
                {
                    list.next=new ListNode((list2.val+r)%10,null);
                    list=list.next;
                    r=1;
                }
                list2=list2.next;
            }
            
        }
        if(r==1)
            list.next=new ListNode(1,null);
        return node.next;
    }
}