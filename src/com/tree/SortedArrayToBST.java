package com.tree;

public class SortedArrayToBST {

    private static BinaryTree logic(int[] array,int start,int end){
        if(start>end) return null;
        int mid = start+(end-start)/2;
        BinaryTree node = new BinaryTree(array[mid]);
        node.setLeftChild(logic(array,start,mid-1));
        node.setRightChild(logic(array,mid+1,end));
        return node;
    }
}
