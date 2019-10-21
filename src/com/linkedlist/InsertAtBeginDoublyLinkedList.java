package com.linkedlist;

public class InsertAtBeginDoublyLinkedList {
    static DoublyLinkedListNode head;

    public static void main(String[] args) {
        createList();
        if(head!=null){
            while (head!=null){
                System.out.println(" ->"+head.getValue());
                head = head.getNextNode();
            }
        }
    }

    protected static void createList(){
        DoublyLinkedListNode node1 = new DoublyLinkedListNode(3);
        addNode(node1,head);
        DoublyLinkedListNode node2 = new DoublyLinkedListNode(4);
        addNode(node2,head);
        DoublyLinkedListNode node3 = new DoublyLinkedListNode(9);
        addNode(node3,head);
        DoublyLinkedListNode node4 = new DoublyLinkedListNode(0);
        addNode(node4,head);
        DoublyLinkedListNode node5 = new DoublyLinkedListNode(1);
        addNode(node5,head);
    }

    private static void addNode(DoublyLinkedListNode node,DoublyLinkedListNode head){
        if(head==null){
            InsertAtBeginDoublyLinkedList.head=node;
        }else{
            node.setNextNode(head);
            head.setPreviousNode(node);
            InsertAtBeginDoublyLinkedList.head = node;
        }
    }
}
