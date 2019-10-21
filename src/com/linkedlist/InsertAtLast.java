package com.linkedlist;

public class InsertAtLast {
    static Node head;

    public static void main(String[] args) {
        createNode();
        if(head!=null){
            while (head!=null){
                System.out.print("->"+head.getValue());
                head=head.getNext();
            }
        }
    }

    protected static void createNode() {
        Node node1 = new Node(3);
        addNode(node1,head);
        Node node2 = new Node(5);
        addNode(node2,head);
        Node node3 = new Node(2);
        addNode(node3,head);
        Node node4 = new Node(8);
        addNode(node4,head);
         Node node5 = new Node(0);
        addNode(node5,head);
         Node node6 = new Node(1);
        addNode(node6,head);
        Node node7 = new Node(10);
        addNode(node7,head);
        Node node8 = new Node(11);
        addNode(node8,head);
    }

    protected static void addNode(Node node,Node head){
        if(head==null){
            InsertAtLast.head=node;
        }else{
            Node temp = head;
            while (temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }
}
