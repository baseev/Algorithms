package com.baseev.coding.interview.stack_queue;

import java.util.Stack;

public class StackWithMin2 extends Stack<Integer>
{
    Stack<Integer> s2;
    
    public StackWithMin2()
    {
        s2 = new Stack<Integer>();
    }

    public void push(int value)
    {
        if (value <= min()) {
            s2.push(value);
        }
        super.push(value);
    }

    public Integer pop()
    {
        int value = super.pop();
        if (value == min()) {
            s2.pop();
        }
        return value;
    }

    public int min()
    {
        System.out.println(s2);
        if (s2.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return s2.peek();
        }
    }
   
    

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        StackWithMin2 s = new StackWithMin2();
        s.push(10);
        s.push(20);
        s.push(5);
        s.push(40);
        s.push(50);
        System.out.println(s.min());
    }

}
