package com.baseev.coding.interview.linked_list;

public class DeleteNode
{

    public Node delete(Node head, int d) {
        Node n = head;
        if(n.data == d) {
            return head.next;
        }
        
        while(n.getNext() != null) {
            if(n.getData() == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }
   
}
