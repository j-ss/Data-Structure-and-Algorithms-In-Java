package com.tree;


import java.util.Stack;

public class PreOrderTraversal {

    public static void main(String[] args) {
        BinaryTree root = createBinaryTree();
        traversal(root);
        iterativeTraversal(root);
    }
    public static BinaryTree createBinaryTree(){
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

    protected static void traversal(BinaryTree root){
        if(root!=null){
            System.out.println(root.data);
            traversal(root.leftChild);
            traversal(root.rightChild);
        }
    }
    private static void iterativeTraversal(BinaryTree root){
        if(root==null){
            System.out.println("Empty tree");
        }
        Stack<BinaryTree> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            BinaryTree node = stack.pop();
            if(node.rightChild!=null)stack.push(node.rightChild);
            if(node.leftChild!=null)stack.push(node.leftChild);
            System.out.println(node.data);
        }
    }
}
