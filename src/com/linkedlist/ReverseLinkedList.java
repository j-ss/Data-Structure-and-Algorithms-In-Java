package com.linkedlist;

public class ReverseLinkedList {

    public static void main(String[] args) {
        InsertAtLast.createNode();
        Node node = InsertAtLast.head;
        node = reverse(node);
        if(node!=null){
            while (node!=null){
                System.out.print("->"+node.getValue());
                node=node.getNext();
            }
        }
    }
    private static Node reverse(Node node){
        Node head=null;
        while(node.getNext()!=null){
            Node temp = node;
            node=node.getNext();
            if(head==null)
            temp.setNext(null);
            else{
                temp.setNext(head);
            }
            head=temp;
        }
        node.setNext(head);
        return node;
    }
}
