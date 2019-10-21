package com.tree;

public class FindAncestorInBinaryTree {

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
        logic(root,15);
    }

    private static boolean logic(BinaryTree root,int data){
        if (root == null) return false;
        if (data == root.data) return true;
        if (logic(root.leftChild, data) || logic(root.rightChild, data)) {
            System.out.println(root.data);
            return true;
        }
        return false;
    }
}
