package com.linkedlist;

public class MergeTwoSortedLinkedList {
   static Node head1;
   static Node head2;
    public static void main(String[] args) {
        Node node1= new Node(1);
        InsertAtLast.addNode(node1,InsertAtLast.head);
        Node node2= new Node(3);
        InsertAtLast.addNode(node2,InsertAtLast.head);
        Node node3= new Node(7);
        InsertAtLast.addNode(node3,InsertAtLast.head);
        Node node4= new Node(10);
        InsertAtLast.addNode(node4,InsertAtLast.head);
        head1 = InsertAtLast.head;
        InsertAtLast.head=null;
        Node node11= new Node(1);
        InsertAtLast.addNode(node11,InsertAtLast.head);
        Node node12= new Node(2);
        InsertAtLast.addNode(node12,InsertAtLast.head);
        Node node13= new Node(5);
        InsertAtLast.addNode(node13,InsertAtLast.head);
        Node node14= new Node(15);
        InsertAtLast.addNode(node14,InsertAtLast.head);
        head2=InsertAtLast.head;
        InsertAtLast.head=null;
        Node node = merge(head1,head2);
        if(node!=null){
            while (node!=null){
                System.out.print("->"+node.getValue());
                node=node.getNext();
            }
        }
    }

    private static Node merge(Node head1,Node head2){
        while (head1!=null&&head2!=null){
            if(head1.getValue()>head2.getValue()){
                Node node = new Node(head2.getValue());
                InsertAtLast.addNode(node,InsertAtLast.head);
                head2=head2.getNext();
            }else{
                Node node = new Node(head1.getValue());
                InsertAtLast.addNode(node,InsertAtLast.head);
                head1=head1.getNext();
            }
        }
        if(head1==null){
            while (head2!=null){
                Node node = new Node(head2.getValue());
                InsertAtLast.addNode(node,InsertAtLast.head);
                head2 = head2.getNext();
            }
        }
        if(head2==null){
            while (head1!=null){
                Node node = new Node(head1.getValue());
                InsertAtLast.addNode(node,InsertAtLast.head);
                head1=head1.getNext();
            }
        }
        return InsertAtLast.head;
    }
}
