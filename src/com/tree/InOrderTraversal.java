package com.tree;

import java.util.Stack;

public class InOrderTraversal {
    public static void main(String[] args) {
        BinaryTree root = createBinaryTree();
//        traversal(root);
//        iterativeTraversal(root);
        reverse(root);
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
        if(root!=null){
            traversal(root.leftChild);
            System.out.println(root.data);
            traversal(root.rightChild);
        }
    }
    private static void iterativeTraversal(BinaryTree root){
        Stack<BinaryTree> stack = new Stack<>();
        boolean exit = false;
        while (!exit){
            if(root!=null){
                stack.push(root);
                root=root.leftChild;
            }else{
                if(stack.isEmpty()){
                    exit=true;
                }else {
                    root = stack.pop();
                    System.out.println(root.data);
                    root = (root.rightChild);
                }
            }
        }
    }

    private static void reverse(BinaryTree root){
        Stack<BinaryTree> stack = new Stack<>();
        if(root==null) return;
        stack.push(root);
        while (!stack.isEmpty()){
            root=stack.peek();
            if(root!=null){
                stack.push(root.leftChild);
            }else{
                root = stack.pop();
                if(stack.isEmpty())return;
                root=stack.pop();
                System.out.println(root.data);
                stack.push(root.rightChild);
            }
        }
    }
}
