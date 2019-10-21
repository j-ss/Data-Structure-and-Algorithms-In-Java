package com.tree;


import java.util.ArrayList;
import java.util.Stack;

public class ZigZagTreeTraversal {
    public static void main(String[] args) {
        BinaryTree root = createBinaryTree();
        zigzagTraversal(root);
    }

    private static BinaryTree createBinaryTree() {
        BinaryTree binaryTree1 = new BinaryTree(1);
        BinaryTree binaryTree2 = new BinaryTree(2);
        BinaryTree binaryTree3 = new BinaryTree(3);
        BinaryTree binaryTree4 = new BinaryTree(4);
        BinaryTree binaryTree5 = new BinaryTree(5);
        BinaryTree binaryTree6 = new BinaryTree(6);
        BinaryTree binaryTree7 = new BinaryTree(7);
        BinaryTree binaryTree8 = new BinaryTree(8);
        BinaryTree binaryTree9 = new BinaryTree(9);
        binaryTree1.setLeftChild(binaryTree2);
        binaryTree1.setRightChild(binaryTree3);
        binaryTree2.setLeftChild(binaryTree4);
        binaryTree2.setRightChild(binaryTree5);
        binaryTree3.setLeftChild(binaryTree6);
        binaryTree3.setRightChild(binaryTree7);
        binaryTree4.setLeftChild(binaryTree8);
        binaryTree4.setRightChild(binaryTree9);
        return binaryTree1;
    }
    private static void zigzagTraversal(BinaryTree root){
        if(root==null) return;
        Stack<BinaryTree> stack1 = new Stack<>();
        Stack<BinaryTree> stack2 = new Stack<>();
        boolean lock = true;
        stack1.push(root);
        while (lock){
            if(stack1.isEmpty())return;
            BinaryTree node = stack1.pop();
            System.out.println(node.data);
            if(node.leftChild!=null) stack2.push(node.leftChild);
            if(node.rightChild!=null) stack2.push(node.rightChild);
            if(stack1.isEmpty()) lock = !lock;
            while (!lock){
                if(stack2.isEmpty())return;
                BinaryTree node1 = stack2.pop();
                System.out.println(node1.data);
                if(node1.rightChild!=null) stack1.push(node1.rightChild);
                if(node1.leftChild!=null) stack1.push(node1.leftChild);
                if(stack2.isEmpty()) lock =!lock;
            }
        }

    }
}
