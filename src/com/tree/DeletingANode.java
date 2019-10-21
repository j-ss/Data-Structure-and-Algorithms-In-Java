package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class DeletingANode {

    public static void main(String[] args) {
        BinaryTree root = createBinaryTree();
        PreOrderTraversal.traversal(root);
        //iterative(root,7);
        //PreOrderTraversal.traversal(root);
        iterativeApproach2(root,7);
        PreOrderTraversal.traversal(root);
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

    private static void deleteLastLeafNode(BinaryTree root,int data){
        Queue<BinaryTree> queue = new LinkedList<>();
        if(root==null)return;
        BinaryTree prev=root;
        queue.offer(root);
        while (true){
            BinaryTree node = queue.poll();
            if(node.leftChild!=null&&node.rightChild!=null){
                prev=node;
                queue.offer(node.leftChild);
                queue.offer(node.rightChild);
            }else{
                if(node.leftChild==null){
                    prev.rightChild=null;
                }
                else {
                    node.leftChild= null;
                }
            }
        }
    }

    private static void iterative(BinaryTree root,int data){
        BinaryTree dataNode=null;
        BinaryTree leafNode=null;
        BinaryTree parentOfLeaf=root;
        Queue<BinaryTree> queue = new LinkedList<>();
        if(root==null) return;
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryTree node = queue.poll();
            if(node.leftChild!=null){
                queue.add(node.leftChild);
                parentOfLeaf=node;
            }
            if(node.rightChild!=null){
                queue.add(node.rightChild);
                parentOfLeaf=node;
            }
            if(node.leftChild==null&&node.rightChild==null&&queue.isEmpty()){
                leafNode=node;
            }
            if(node.data==data){
                dataNode=node;
            }
        }
        if(dataNode!=null){
            dataNode.data=leafNode.data;
            if(parentOfLeaf.rightChild==leafNode){
                parentOfLeaf.rightChild=null;
            }
            if(parentOfLeaf.leftChild==leafNode){
                parentOfLeaf.leftChild=null;
            }
        }


    }

    private static void iterativeApproach2(BinaryTree root,int data){
        if(root==null){
            System.out.println("Not found");
            return;
        }else{
            if(root.leftChild==null){
                if(root.data==data){
                    //replace else not found return
                    return;
                }
            }
        }
        Queue<BinaryTree> queue = new LinkedList();
        BinaryTree current = null , leafParent = null;
        queue.offer(root);
        while (!queue.isEmpty()){
            BinaryTree node = queue.poll();
            if(node.data==data) current=node;
            if(node.leftChild!=null||node.rightChild!=null){
                leafParent=node;
                if(node.leftChild!=null){
                    queue.offer(node.leftChild);
                }
                if(node.rightChild!=null){
                    queue.offer(node.rightChild);
                }
            }
        }

        if(current!=null){
            if(leafParent.rightChild!=null){
                current.setData(leafParent.rightChild.data);
                leafParent.rightChild=null;
            }else{
                current.setData(leafParent.leftChild.data);
                leafParent.leftChild=null;
            }
        }else{
            System.out.println("not found");
        }
    }
}
