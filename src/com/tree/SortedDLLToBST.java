package com.tree;

import com.linkedlist.DoublyLinkedListNode;

public class SortedDLLToBST {

    private static BinaryTree logic(DoublyLinkedListNode head,int start,int end){
        if(start>end){
            return null;
        }
        int mid = start+(end-start)/2;
        BinaryTree left = logic(head,start,mid-1);
        BinaryTree node = new BinaryTree(head.getValue());
        node.setLeftChild(left);
        if(head.getNextNode()!=null){
            head.setValue(head.getNextNode().getValue());
            head.setNextNode(head.getNextNode().getNextNode());
        }
        node.setRightChild(logic(head,mid+1,end));
        return node;
    }
}
