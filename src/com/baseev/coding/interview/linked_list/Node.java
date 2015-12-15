package com.baseev.coding.interview.linked_list;

public class Node
{
    public Node next;
    public int data;
    
    public Node(int d) {
        data = d;
    }
    
    public void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public Node getNext()
    {
        return next;
    }

    public int getData()
    {
        return data;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public void setData(int data)
    {
        this.data = data;
    }
    
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next;
        while(current != null) {
            System.out.println("current : "+current);
            next = current.next;
            System.out.println("next : "+next);
            current.next = prev;
            System.out.println("current : "+current);
            prev = current;
            System.out.println("prev : "+prev);
            current = next;      
            System.out.println("current : "+current);
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("\n");
        }
        return prev;
    }

    @Override
    public String toString()
    {
        return "Node [next=" + next + ", data=" + data + "]";
    }
    
}
