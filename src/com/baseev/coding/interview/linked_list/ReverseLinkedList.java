package com.baseev.coding.interview.linked_list;


public class ReverseLinkedList {
    Node head;
        
    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
//        head.next.next.next = new Node(40);
//        head.next.next.next.next = new Node(50);
//        head.next.next.next.next.next = new Node(60);
        
        
//        Node head1 = head;
//        while(head1 != null) {
//            System.out.println(head1.data);
//            head1 = head1.next;
//        }
        
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        
        Node reverse = Node.reverse(head);
        while(reverse != null) {
            System.out.println(reverse.data);
            reverse = reverse.next;
        }
    }
}
