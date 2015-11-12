package com.baseev.coding.interview.stack_queue;

import java.util.Stack;

/**
 * 
 * 
How would you design a stack which, in addition to push and pop, also has a function
min which returns the minimum element? Push, pop and min should all operate in
O(1) time.

    You can implement this by having each node in the stack keep track of the minimum be-
    neath itself. Then, to find the min, you just look at what the top element thinks is the min.
    When you push an element onto the stack, the element is given the current minimum. It sets
    its “local min” to be the min.
    
 * @author baseev
 *
 */
public class StackMin 
    extends Stack<NodeWithMin>
{
    public void push(int value) {
        int min = Math.max(value, min());
        super.push(new NodeWithMin(value, min));
    }
    
    public int min() {
        if(this.isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            return peek().min;
        }
    }
}
    
class NodeWithMin {
    public int value;
    public int min;
    public NodeWithMin(int v, int min){
        value = v;
        this.min = min;
    }
}
