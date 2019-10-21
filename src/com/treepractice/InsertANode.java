package com.treepractice;

import java.util.LinkedList;
import java.util.Queue;

public class InsertANode {

    private static BinaryTreeNode insert(BinaryTreeNode root,int data){
        Queue<BinaryTreeNode> queue1 = new LinkedList<>();
        Queue<BinaryTreeNode> queue2 = new LinkedList<>();
        if(root==null){
            BinaryTreeNode node = new BinaryTreeNode(data);
            return node;
        }
        queue1.add(root);
        while (!queue1.isEmpty()){
            BinaryTreeNode currentNode = queue1.poll();
            if(currentNode.getLeft()!=null){
                queue1.add(currentNode.getLeft());
            }
            if(currentNode.getRight()!=null){
                queue1.add(currentNode.getRight());
            }
            System.out.println(currentNode.getData());
        }
        return root;
    }
}
