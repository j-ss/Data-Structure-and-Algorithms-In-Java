package com.tree;

public class DeleteANodeBST {

    private static BinaryTree delete(BinaryTree root,int data){
        if(root==null) return null;
        if(data>root.getData()){
            root.setRightChild(delete(root.getRightChild(),data));
        }else if(data<root.getData()){
            root.setLeftChild(delete(root.getLeftChild(),data));
        }else{
            //case first no child
            if(root.getLeftChild()==null&&root.getRightChild()==null){
                return null;
            }else if(root.getRightChild()==null){
                BinaryTree temp = root.leftChild;
                root.setLeftChild(null);
                return temp;
            }else if(root.getLeftChild()==null){
                BinaryTree temp = root.rightChild;
                root.setRightChild(null);
                return temp;
            }else{
                BinaryTree successor = findSuccessor(root.getRightChild());
                root.setData(successor.data);
                root.setRightChild(delete(root.rightChild,successor.data));
            }
        }
        return root;
    }

    private static BinaryTree findSuccessor(BinaryTree node){
        while (node.getLeftChild()!=null){
            node=node.getLeftChild();
        }
        return node;
    }
}
