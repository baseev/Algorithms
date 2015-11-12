package com.baseev.coding.interview.linked_list;


/**
 * 
You have two numbers represented by a linked list, where each node contains a sin-
gle digit. The digits are stored in reverse order, such that the 1’s digit is at the head of
the list. Write a function that adds the two numbers and returns the sum as a linked
list.
EXAMPLE
Input: (3 -> 1 -> 5), (5 -> 9 -> 2)
Output: 8 -> 0 -> 8


 * @author baseev
 *
 */
public class AddLists
{
    public Node add(Node l1, Node l2, int carry) {
        if(l1 ==null && l2 ==null) {
            return null;
        }
        
        Node result = new Node(carry);
        int value = carry;
        
        if(l1 == null) {
            value += l1.data;
        }
        
        if(l2 == null) {
            value += l2.data;
        }
        
        result.data = value %10;
        
        Node more = add(l1==null ? null : l1.next, l2==null ? null : l2.next, value > 10 ? 1 : value);
        
        result.next = more;
        return result;
        
    }

}
