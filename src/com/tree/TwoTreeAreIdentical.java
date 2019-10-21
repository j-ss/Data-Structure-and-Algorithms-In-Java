package com.tree;

public class TwoTreeAreIdentical {

    public static void main(String[] args) {
        BinaryTree root1=createBinaryTree();
        BinaryTree root2=createBinaryTree();
        System.out.println(identical(root1,root2));
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
        //binaryTree4.setLeftChild(binaryTree8);
        return binaryTree1;
    }

    private static boolean identical(BinaryTree root1,BinaryTree root2){
        if(root1==null&&root2==null) return true;
        if(root1==null||root2==null) return false;
        return identical(root1.leftChild,root2.rightChild)&&identical(root1.rightChild,root2.leftChild);
    }
}
