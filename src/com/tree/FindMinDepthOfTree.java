package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class FindMinDepthOfTree {
    public static void main(String[] args) {
        BinaryTree root = createBinaryTree();
        PreOrderTraversal.traversal(root);
        System.out.println(iterative(root));
        PreOrderTraversal.traversal(root);
    }
    private static BinaryTree createBinaryTree(){
        BinaryTree binaryTree1 = new BinaryTree(1);
        BinaryTree binaryTree2 = new BinaryTree(2);
        BinaryTree binaryTree3 = new BinaryTree(3);
        BinaryTree binaryTree4 = new BinaryTree(4);
        BinaryTree binaryTree5 = new BinaryTree(5);
        BinaryTree binaryTree6 = new BinaryTree(6);
        BinaryTree binaryTree7 = new BinaryTree(7);
        BinaryTree binaryTree8 = new BinaryTree(8);
        binaryTree1.setLeftChild(binaryTree2);
        binaryTree1.setRightChild(binaryTree3);
        binaryTree2.setLeftChild(binaryTree4);
        binaryTree2.setRightChild(binaryTree5);
        binaryTree3.setLeftChild(binaryTree6);
        binaryTree3.setRightChild(binaryTree7);
        binaryTree4.setLeftChild(binaryTree8);
        return binaryTree1;
    }

    private static int iterative(BinaryTree root){
        Queue<BinaryTree> queue = new LinkedList<>();
        int count=1;
        if(root==null) return 0;
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()){
            BinaryTree current = queue.poll();
            if(current!=null){
                if(current.leftChild==null && current.rightChild==null){
                    return count;
                }
                if(current.leftChild!=null) queue.add(current.leftChild);
                if(current.rightChild!=null) queue.add(current.rightChild);
            }else{
                if(!queue.isEmpty()){
                    count++;
                    queue.add(null);
                }
            }
        }
        return count;
    }
}
