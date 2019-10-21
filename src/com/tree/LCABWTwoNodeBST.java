package com.tree;

public class LCABWTwoNodeBST {

    public static void main(String[] args) {
        //create BST
        BinaryTree root = new BinaryTree(10);
        BinaryTree node1 = new BinaryTree(8);
        BinaryTree node2 = new BinaryTree(13);
        BinaryTree node3 = new BinaryTree(7);
        BinaryTree node4 = new BinaryTree(9);
        BinaryTree node5 = new BinaryTree(11);
        BinaryTree node6 = new BinaryTree(15);
        root.setLeftChild(node1);
        root.setRightChild(node2);
        node1.setLeftChild(node3);
        node1.setRightChild(node4);
        node2.setRightChild(node6);
        node2.setLeftChild(node5);
        logic(root,node5,node6);
    }

    private static void logic(BinaryTree root,BinaryTree node1,BinaryTree node2){
        if(root==null) return;
        if(root.data>Integer.max(node1.data,node2.data)){
            logic(root.leftChild,node1,node2);
        }
        else if(root.data<Integer.min(node1.data,node2.data)){
            logic(root.rightChild,node1,node2);
        }else{
            System.out.println("ancestor "+root.data);
        }
    }
}
