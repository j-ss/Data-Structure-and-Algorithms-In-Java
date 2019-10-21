package com.tree;

public class LCABwTwoNodeBinaryTree {

    public static void main(String[] args) {
        //create BST
        BinaryTree root = new BinaryTree(1);
        BinaryTree node1 = new BinaryTree(2);
        BinaryTree node2 = new BinaryTree(3);
        BinaryTree node3 = new BinaryTree(4);
        BinaryTree node4 = new BinaryTree(5);
        BinaryTree node5 = new BinaryTree(6);
        BinaryTree node6 = new BinaryTree(7);
        root.setLeftChild(node1);
        root.setRightChild(node2);
        node1.setLeftChild(node3);
        node1.setRightChild(node4);
        node2.setRightChild(node6);
        node2.setLeftChild(node5);
        logic(root,node3,node4);
    }


    private static BinaryTree logic(BinaryTree root,BinaryTree node1,BinaryTree node2){
        if (root == null) return null;
        if (root == node1 || root == node2) {
            //System.out.println(root.data);
            return root;
        }
        BinaryTree left = logic(root.getLeftChild(), node1, node2);
        BinaryTree right = logic(root.getRightChild(), node1, node2);
        if (left != null && right != null) {
            System.out.println("Ancestor is" + root.data);
            System.exit(0);
            //return root;
        }
        if (left == null && right == null) {
            return null;
        }
        //System.out.println(root.data);
        return left != null ? left : right;
    }

}
