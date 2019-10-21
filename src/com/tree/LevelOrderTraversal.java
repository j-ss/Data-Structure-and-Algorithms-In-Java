package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTree root = createBinaryTree();
        traversal(root);
    }
    private static BinaryTree createBinaryTree(){
        BinaryTree binaryTree1 = new BinaryTree(1);
        BinaryTree binaryTree2 = new BinaryTree(2);
        BinaryTree binaryTree3 = new BinaryTree(3);
        BinaryTree binaryTree4 = new BinaryTree(4);
        BinaryTree binaryTree5 = new BinaryTree(5);
        BinaryTree binaryTree6 = new BinaryTree(6);
        BinaryTree binaryTree7 = new BinaryTree(7);
        binaryTree1.setLeftChild(binaryTree2);
        binaryTree1.setRightChild(binaryTree3);
        binaryTree2.setLeftChild(binaryTree4);
        binaryTree2.setRightChild(binaryTree5);
        binaryTree3.setLeftChild(binaryTree6);
        binaryTree3.setRightChild(binaryTree7);
        return binaryTree1;
    }

    private static void traversal(BinaryTree root){
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryTree front = queue.poll();
            System.out.println(front.data);
            if(front.leftChild!=null) queue.add(front.leftChild);
            if(front.rightChild!=null) queue.add(front.rightChild);
        }
    }
}
