/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hmap=new HashMap<>();
        Node temp=head;
        while(temp!=null)
        {
            hmap.put(temp,new Node(temp.val));
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
             hmap.get(temp).next=hmap.get(temp.next);
             hmap.get(temp).random=hmap.get(temp.random);
             temp=temp.next;
        }
        
        return hmap.get(head);
    }
}