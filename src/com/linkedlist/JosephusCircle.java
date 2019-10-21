package com.linkedlist;

public class JosephusCircle {
    static Node tail;
    public static void main(String[] args) {
        Node node1 = new Node(3);
        CircularLinkedList.createList(node1,CircularLinkedList.tail);
        Node node2 = new Node(5);
        CircularLinkedList.createList(node2,CircularLinkedList.tail);
        Node node3 = new Node(2);
        CircularLinkedList.createList(node3,CircularLinkedList.tail);
        Node node4 = new Node(8);
        CircularLinkedList.createList(node4,CircularLinkedList.tail);
        Node node5 = new Node(0);
        CircularLinkedList.createList(node5,CircularLinkedList.tail);
        Node node6 = new Node(1);
        CircularLinkedList.createList(node6,CircularLinkedList.tail);
        Node node7 = new Node(10);
        CircularLinkedList.createList(node7,CircularLinkedList.tail);
        Node node8 = new Node(11);
        CircularLinkedList.createList(node8,CircularLinkedList.tail);
        tail=CircularLinkedList.tail;

        int value = findRemainingPerson(3,tail);
        System.out.println(value);
        Node head = tail.getNext();
        while (head!=tail){
            System.out.print(" ->"+head.getValue());
            head=head.getNext();
        }
        System.out.print(" ->"+head.getValue());
    }
    private static int findRemainingPerson(int k,Node tail){
        Node head = tail.getNext();
        while (head.getNext()!=null){
            for(int i=1;i<=k;i++){

            }
        }
        return 0;
    }
}
