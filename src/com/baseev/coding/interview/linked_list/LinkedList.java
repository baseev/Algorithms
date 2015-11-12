package com.baseev.coding.interview.linked_list;

import java.util.ArrayList;
import java.util.List;

public class LinkedList
{
    LinkedListNode head;
    
    public LinkedList() {
        head = new LinkedListNode(null);
    }
    
    public LinkedList(Object data) {
        head = new LinkedListNode(data);
    }
    
    public void add(Object data) {
        LinkedListNode temp = new LinkedListNode(data);
        LinkedListNode current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);       
    }
    
    public void traverseAndPrint() {
        LinkedListNode current = head;
        while(current.getNext() != null){
            current = current.getNext();
            System.out.println(current.getData());
        }
    }
    

    /**
     * @param args
     */
    public static void main(String[] args)
    {        
        List<String> data = new ArrayList<String>();
        data.add("1");
        data.add("2");
        data.add("3");
        data.add("4");
        data.add("5");
        data.add("6");
        data.add("7");
        data.add("8");
        
        LinkedList myList = new LinkedList();
        for(String d : data) {
            myList.add(d);
        }
        
        myList.traverseAndPrint();
    }

}
