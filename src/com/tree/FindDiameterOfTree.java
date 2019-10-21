package com.tree;

import org.omg.CORBA.INTERNAL;

public class FindDiameterOfTree {

    private static int diameter(BinaryTree root){
        if(root==null) return 0;
        int option1 = height(root.leftChild)+height(root.rightChild);
        int option2 = diameter(root.leftChild);
        int option3 = diameter(root.rightChild);
        return Integer.max(option1, Integer.max(option2,option3));
    }
    private static int height(BinaryTree root){
        if(root==null) return 0;
        int lh = height(root.leftChild);
        int rh = height(root.rightChild);
        return lh>rh?lh+1:rh+1;
    }
}
