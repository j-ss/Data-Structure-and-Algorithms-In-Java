package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class FindMaxElementInTree {
    public static void main(String[] args) {
        BinaryTree root = createBinaryTree();
        int max = recursive(root);
        System.out.println("Max value is "+max);
        int maxV = iterative(root);
        System.out.println("Max value is "+maxV);
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
    private static int recursive(BinaryTree root){
        int maxValue = Integer.MIN_VALUE;
        if(root!=null){
            int leftMax=recursive(root.leftChild);
            int rightMax=recursive(root.rightChild);
            if(leftMax>rightMax){
                maxValue=leftMax;
            }else{
                maxValue=rightMax;
            }
            if(root.data>maxValue){
                maxValue=root.data;
            }
        }
        return maxValue;
    }
    private static int iterative(BinaryTree root){
        Queue<BinaryTree> queue = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryTree node = queue.poll();
            if(node.leftChild!=null) queue.add(node.leftChild);
            if(node.rightChild!=null) queue.add(node.rightChild);
            if(max<node.data){
                max=node.data;
            }
        }
        return max;
    }
}
