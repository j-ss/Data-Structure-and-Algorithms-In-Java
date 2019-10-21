package com.linkedlist;

public class DeleteANodeAtKPos {

    public static void main(String[] args) {
        InsertAtLast.createNode();
        Node head = InsertAtLast.head;
        deleteAtK(head,3);
        if(head!=null){
            while (head!=null){
                System.out.print("->"+head.getValue());
                head=head.getNext();
            }
        }
    }

    private static void deleteAtK(Node head,int pos){
        if(head==null){
            System.out.println("Linked list is empty");
        }else{
            int count = 1;
            while (head.getNext()!=null&&count!=pos-1){

                head=head.getNext();
                count++;
            }
            if(count==pos-1){
                Node temp = head.getNext().getNext();
                head.setNext(temp);
            }else{
                System.out.println("list size is small");
            }
        }
    }
}
