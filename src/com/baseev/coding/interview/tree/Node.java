package com.baseev.coding.interview.tree;

public class Node<T>
{
    public T data;
    public Node left;
    public Node right;
    
    public Node(T m_data) {
        data = m_data;
    }
    
    public Node(T m_data, Node m_left, Node m_right) {
        data = m_data;
        right = m_right;
        left = m_left;
    }
}
