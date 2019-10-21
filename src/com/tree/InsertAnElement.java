package com.tree;


import java.util.LinkedList;
import java.util.Queue;

public class InsertAnElement {

    public static void main(String[] args) {
        BinaryTree root = createBinaryTree();
        BinaryTree node = new BinaryTree(8);
        PreOrderTraversal.traversal(root);
        recursive(root,node);
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
        binaryTree1.setLeftChild(binaryTree2);
        binaryTree1.setRightChild(binaryTree3);
        binaryTree2.setLeftChild(binaryTree4);
        binaryTree2.setRightChild(binaryTree5);
        binaryTree3.setLeftChild(binaryTree6);
        binaryTree3.setRightChild(binaryTree7);
        return binaryTree1;
    }

    private static void iterative(BinaryTree root,BinaryTree newNode){
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryTree node = queue.poll();
            if(node.leftChild==null){
                node.leftChild=newNode;
                break;
            }else{
                queue.add(node.leftChild);
            }
            if(node.rightChild==null){
                node.rightChild = newNode;
                break;
            }else{
                queue.add(node.rightChild);
            }
        }
    }

    private static void recursive(BinaryTree root,BinaryTree newNode){
        if(root.leftChild==null){
            root.leftChild=newNode;
        }else if(root.rightChild==null){
            root.rightChild=newNode;
        }else if(root.leftChild!=null){
            recursive(root.leftChild,newNode);
        }else if(root.rightChild!=null){
            recursive(root.rightChild,newNode);
        }
    }


}
