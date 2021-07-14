/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// Brute force tc=O(n) SC=O(n)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode temp=headA;
        HashMap<String,Boolean> hmap=new HashMap<>();
        while(temp!=null)
        {
            hmap.put(temp.toString(),true);
            temp=temp.next;
        }
        ListNode temp2=headB;
        while(temp2!=null)
        {
            if(hmap.containsKey(temp2.toString()))
                return temp2;
            temp2=temp2.next;
        }
        return null;
    }
}

// optimise solution
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
       /* ListNode temp=headA;
        HashMap<String,Boolean> hmap=new HashMap<>();
        while(temp!=null)
        {
            hmap.put(temp.toString(),true);
            temp=temp.next;
        }
        ListNode temp2=headB;
        while(temp2!=null)
        {
            if(hmap.containsKey(temp2.toString()))
                return temp2;
            temp2=temp2.next;
        }
        return null;
        */
        int lengthA=0;
        int lengthB=0;
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null)
        {
            lengthA++;
            tempA=tempA.next;
        }
        while(tempB!=null)
        {
            lengthB++;
            tempB=tempB.next;
        }
        int diff=Math.abs(lengthA-lengthB);
        int count=0;
        tempA=headA;
        tempB=headB;
        if(lengthA>lengthB)
        {
            while(count<diff)
            {
                tempA=tempA.next;
                count++;
            }
                
                
        }
        else
        {
            while(count<diff)
            {
                tempB=tempB.next;
                count++;
            }
                
        }
        while(tempA!=null && tempB!=null)
        {
            if(tempA==tempB)
            {
                return tempA;
            }
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return null;
    }
}