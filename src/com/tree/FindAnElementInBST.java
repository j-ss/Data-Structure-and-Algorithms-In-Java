package com.tree;

public class FindAnElementInBST {

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
        logic(root,8);
    }

    private static void logic(BinaryTree root,int data){
        while (root!=null){
            if(data>root.data){
                root=root.rightChild;
            }else if(data<root.data){
                root=root.leftChild;
            }
            if(data==root.data){
                System.out.println("Found");
                break;
            }
        }
    }
}
