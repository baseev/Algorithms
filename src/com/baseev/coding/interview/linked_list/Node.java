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
}
