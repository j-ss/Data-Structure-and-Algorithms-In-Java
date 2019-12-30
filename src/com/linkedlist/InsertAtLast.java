package com.linkedlist;

public class InsertAtLast {
    static Node head;
    static Node head1;
    static Node head2;

    public static void main(String[] args) {
//        createNode();
//        if(head!=null){
//            while (head!=null){
//                System.out.print("->"+head.getValue());
//                head=head.getNext();
//            }
//        }
//
        createSmallNode1();
        createSmallNode2();
        int c =0 ;
        int node  = addList(head1,head2,head);
        System.out.println(node);
    }

    private static int addList(Node head1,Node head2,Node head){
        if(head1==null&&head2==null) return 0;
        int c = addList(head1.getNext(),head2.getNext(),head);
        int sum  = head1.getValue()+head2.getValue()+c;
        c = sum/10;
        int data = sum%10;
        System.out.println(data);
//        System.out.println(head1.getValue()+" "+head2.getValue());
        return c;
    }
    private static void createSmallNode1(){
        Node node1 = new Node(9);
        addNode1(node1,head1);
        Node node2 = new Node(8);
        addNode1(node2,head1);
        Node node3 = new Node(6);
        addNode1(node3,head1);
    }

    private static void createSmallNode2(){
        Node node1 = new Node(1);
        addNode2(node1,head2);
        Node node2 = new Node(2);
        addNode2(node2,head2);
        Node node3 = new Node(4);
        addNode2(node3,head2);
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

    protected static void addNode1(Node node,Node head){
        if(head==null){
            InsertAtLast.head1=node;
        }else{
            Node temp = head;
            while (temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    protected static void addNode2(Node node,Node head){
        if(head==null){
            InsertAtLast.head2=node;
        }else{
            Node temp = head;
            while (temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }
}
