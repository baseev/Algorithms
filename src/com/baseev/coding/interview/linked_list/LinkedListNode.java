package com.baseev.coding.interview.linked_list;


public class LinkedListNode
{

    private LinkedListNode previous;
    private Object data;
    private LinkedListNode next;
    
    public LinkedListNode(Object data) {
        this.data = data;
    }
    
    public LinkedListNode getPrevious()
    {
        return previous;
    }

    public void setPrevious(LinkedListNode previous)
    {
        this.previous = previous;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }

    public LinkedListNode getNext()
    {
        return next;
    }

    public void setNext(LinkedListNode next)
    {
        this.next = next;
    }

    @Override
    public String toString()
    {
        return "LinkedListNode [previous=" + previous + ", data=" + data
                + ", next=" + next + "]";
    }
}
