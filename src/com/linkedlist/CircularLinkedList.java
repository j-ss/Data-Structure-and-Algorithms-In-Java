package com.linkedlist;

public class CircularLinkedList {
    static Node tail;
    protected static void createList(Node node,Node tail){
        if(tail==null){
            CircularLinkedList.tail=node;
            CircularLinkedList.tail.setNext(node);
        }else{
            Node head = tail.getNext();
            tail.setNext(node);
            node.setNext(head);
            CircularLinkedList.tail=node;
        }
    }
}
