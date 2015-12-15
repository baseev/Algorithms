package com.baseev.coding.interview.tree;

public class LowestCommonAncestor
{

     public static BSTNode LCA(BSTNode root, int n1, int n2) {
         if(root == null) {
             return null;
         }
         if(root.data > n1 && root.data > n2) {
            return LCA(root.left, n1, n2); 
         }
         if(root.data < n1 && root.data < n2) {
             return LCA(root.right, n1, n2); 
         }         
         return root;
     }

     public static void main(String[] args) {
         BSTNode node = new BSTNode(5);

         BSTNode nodel1 = new BSTNode(3);
         nodel1.left = new BSTNode(2);
         nodel1.right = new BSTNode(4);

         BSTNode noder1 = new BSTNode(7);
         noder1.left = new BSTNode(6);
         noder1.right = new BSTNode(8);
         
         node.left = nodel1;
         node.right = noder1;

         int n1=3, n2=8;
         
         BSTNode n = LCA(node, n1, n2);
         
         System.out.println(n.data);
         
     }
}


class BSTNode {
    public int data;
    public BSTNode left;
    public BSTNode right;
    
    public BSTNode(int data) {
        this.data = data;
    }
    
    public BSTNode(int data, BSTNode left, BSTNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString()
    {
        return "BSTNode [data=" + data + ", left=" + left + ", right=" + right
                + "]";
    }
}