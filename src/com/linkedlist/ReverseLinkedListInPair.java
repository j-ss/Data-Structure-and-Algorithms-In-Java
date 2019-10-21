package com.linkedlist;

public class ReverseLinkedListInPair {
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
        Node temp2=null;
        if(node==null||node.getNext()==null){
            System.out.println("List size is less then 2");
        }else {
            temp2 = node.getNext();
            Node temp = null;
            while (node != null&&node.getNext()!=null) {
                if (temp != null) {
                    temp.getNext().setNext(node.getNext());
                }
                temp=node.getNext();
                if(temp!=null) {
                    node.setNext(temp.getNext());
                    temp.setNext(node);
                }
                node=node.getNext();

            }
        }
        return temp2;
    }
}
