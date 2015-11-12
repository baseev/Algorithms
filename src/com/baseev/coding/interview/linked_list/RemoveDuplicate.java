package com.baseev.coding.interview.linked_list;

import java.util.Hashtable;

public class RemoveDuplicate
{
    public static void removeDup(Node node) {
        Hashtable table = new Hashtable();
        Node previous = null;
        while(node!=null) {
            if(table.contains(node.data)) {
                previous.next = node.next;
            } else {
                table.put(node.data, true);
                previous = node;
            }
            node = node.next;
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

}
