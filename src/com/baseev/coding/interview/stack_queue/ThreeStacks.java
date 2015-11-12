package com.baseev.coding.interview.stack_queue;

/**
 * 
 * Describe how you could use a single array to implement three stacks.
 * 
 * Approach 1:
Divide the array in three equal parts and allow the individual stack to grow in that limited
space (note: “[“ means inclusive, while “(“ means exclusive of the end point).
»» for stack 1, we will use [0, n/3)
»» for stack 2, we will use [n/3, 2n/3)
»» for stack 3, we will use [2n/3, n)
This solution is based on the assumption that we do not have any extra information about
the usage of space by individual stacks and that we can’t either modify or use any extra
space. With these constraints, we are left with no other choice but to divide equally.

 * 
 * 
 * @author baseev
 *
 */

public class ThreeStacks
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

}
