package com.linkedlist;

public class DeleteAtKPosDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedListNode head;
        InsertAtBeginDoublyLinkedList.createList();
        head  = InsertAtBeginDoublyLinkedList.head;
        deleteAtK(head,3);
        if(head!=null){
            while (head!=null){
                System.out.println(" ->"+head.getValue());
                head = head.getNextNode();
            }
        }
    }
    private static void deleteAtK(DoublyLinkedListNode head,int pos){
        if(head==null){
            System.out.println("Linked list is empty");
        }else{
            int count = 1;
            while (head.getNextNode()!=null&&count!=pos-1){

                head=head.getNextNode();
                count++;
            }
            if(count==pos-1){
                DoublyLinkedListNode temp = head.getNextNode();
                head.setNextNode(temp.getNextNode());
                temp.getNextNode().setPreviousNode(head);
                temp.setNextNode(null);
                temp.setPreviousNode(null);
            }else{
                System.out.println("list size is small");
            }
        }
    }
}
