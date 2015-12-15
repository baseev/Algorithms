package com.baseev.coding.careercup;

import java.util.Stack;

public class NextBigNumber {
    private int array[] = {7, 5, 6, 3, 4, 1, 2, 9, 3}; 
    private Stack<Integer> stack= new Stack<Integer>();
    public NextBigNumber()
    {
        arrange();
    }
    
    public void arrange()
    {
        stack.push(array[array.length-1]);
        for(int i=array.length-2;i>=0;i--)
        {
            int current = array[i];
            if(current<=stack.peek())
            {
                array[i]=stack.peek();
                stack.push(current);
            }
            else
            {
                while(!stack.empty() && current > stack.peek())
                {
                    int a = stack.pop();
                }
                if(!stack.empty())
                {
                    array[i]=stack.peek();
                    
                }
                stack.push(current);
            }
        }
    }
    
    public void print()
    {
        for(int i = 0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    
    public static void main(String args[]) {
        NextBigNumber n = new NextBigNumber();
        n.print();
    }
    
}