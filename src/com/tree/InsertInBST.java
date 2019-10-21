package com.tree;

public class InsertInBST {

    private static BinaryTree logic(BinaryTree root,int data){
        BinaryTree prev=null;
        if(root==null){
            root=new BinaryTree(data);
            return root;
        }else{
            while (root!=null){
                prev=root;
            if(data<root.getData()){
                root=root.getLeftChild();
            }else if(data>root.getData()){
                root=root.getRightChild();
            }
            }
        }
        if(prev.getData()>data){
            prev.setLeftChild(new BinaryTree(data));
        }
        if(prev.getData()<data){
            prev.setRightChild(new BinaryTree(data));
        }
    return null;
    }
}
