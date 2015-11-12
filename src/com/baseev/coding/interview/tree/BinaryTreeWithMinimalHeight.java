package com.baseev.coding.interview.tree;

/**
 * 
Given a sorted (increasing order) array, write an algorithm to create a binary tree with
minimal height.

SOLUTION
==========
    We will try to create a binary tree such that for each node, the number of nodes in the left
    subtree and the right subtree are equal, if possible.
    Algorithm:
    1.   Insert into the tree the middle element of the array.
    2.   Insert (into the left subtree) the left subarray elements
    3.   Insert (into the right subtree) the right subarray elements
    4.   Recurse


 * @author baseev
 *
 */
public class BinaryTreeWithMinimalHeight
{
    public static Node addToTree(int arr[], int start, int end) {
        if(end<start) {
            return null;
        }
        
        int mid = (start+end)/2;
        Node node = new Node(arr[mid]);
        node.left = addToTree(arr, start, mid-1);
        node.right = addToTree(arr, mid+1, end);
        
        return node;
    }
    
    public static Node createminimalBST(int[] arr) {
        return addToTree(arr, 0, arr.length-1);
    }
    
}
