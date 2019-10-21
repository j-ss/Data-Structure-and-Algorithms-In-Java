package com.tree;

public class FindMaxElementInBST {

    private static void logic(BinaryTree root){
        if(root==null) return;
        while (root.getRightChild()!=null){
            root=root.getRightChild();
        }
        System.out.println(root.getData());
    }
}
