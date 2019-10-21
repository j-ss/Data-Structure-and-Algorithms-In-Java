package com.tree;

import java.util.*;

public class PrintRootToLeafPath {

    public static void main(String[] args) {
        BinaryTree root1=createBinaryTree();
        printRootToLeaf(root1,new LinkedList<>());
       // iterative(root1);
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

    private static void printRootToLeaf(BinaryTree root, List<Integer> result){
        if(root==null) return;
        result.add(root.data);
        if(root.leftChild==null&&root.rightChild==null){
            System.out.println(result);
        }
        printRootToLeaf(root.leftChild,result);
        printRootToLeaf(root.rightChild,result);
        result.remove(result.size()-1);
    }

//    private static void iterative(BinaryTree root){
//        if(root==null){
//            System.out.println("Empty tree");
//        }
//        Stack<BinaryTree> stack = new Stack<>();
//        ArrayList<BinaryTree> result = new ArrayList<>();
//        stack.push(root);
//        while (!stack.isEmpty()){
//            BinaryTree node = stack.pop();
//            if(node.rightChild!=null)stack.push(node.rightChild);
//            if(node.leftChild!=null)stack.push(node.leftChild);
//            result.add(node);
//            if (node.leftChild==null||node.rightChild==null){
//                for (BinaryTree b:result) {
//                    System.out.print(b.data);
//                }
//                result.remove(result.size()-1);
//                System.out.println();
//            }
//        }
//    }
}
