package com.tree;

import java.util.Stack;

public class PostOrderTraversal {

    public static void main(String[] args) {
        BinaryTree root = createBinaryTree();
        traversal(root);
        iterativeTraversal(root);
        System.out.println();
        BinaryTree root1 = interviewQuestion(root);
        traversal(root1);
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

    private static BinaryTree interviewQuestion(BinaryTree root){
        if(root.leftChild!=null&&root.rightChild!=null){
            BinaryTree left = interviewQuestion(root.leftChild);
            BinaryTree right = interviewQuestion(root.rightChild);
            root.data = left.data+right.data+root.data;
        }
        return root;
    }

    private static void traversal(BinaryTree root){
        if(root!=null){
            traversal(root.leftChild);
            traversal(root.rightChild);
            System.out.println(root.data);
        }
    }

    private static void iterativeTraversal(BinaryTree root){
        Stack<BinaryTree> stack1 = new Stack<>();
        Stack<BinaryTree> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()){
            BinaryTree node = stack1.pop();
            stack2.push(node);
            if(node.leftChild!=null) stack1.push(node.leftChild);
            if(node.rightChild!=null) stack1.push(node.rightChild);
        }

        while (!stack2.isEmpty()){
            System.out.println(stack2.pop().data);
        }
    }
}
