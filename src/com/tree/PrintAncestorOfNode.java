package com.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrintAncestorOfNode {
    public static void main(String[] args) {
        BinaryTree root = createBinaryTree();
        printAncestor(root, 3, new ArrayList<>());
    }

    private static BinaryTree createBinaryTree() {
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

    private static void printAncestor(BinaryTree root, int data, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.data == data) {
            System.out.println(result);
        }
        result.add(root.data);
        printAncestor(root.leftChild, data, result);
        printAncestor(root.rightChild, data, result);
        result.remove(result.size() - 1);
    }
}
