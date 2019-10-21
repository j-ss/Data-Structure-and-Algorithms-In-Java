package com.linkedlist;

public class ReverseLinkedListInGroup {
    public static void main(String[] args) {
        InsertAtLast.createNode();
        Node node = InsertAtLast.head;
        Node t = node;
        if(t!=null){
            while (t!=null){
                System.out.print("->"+t.getValue());
                t=t.getNext();
            }
        }
        System.out.println();
        node = reverse(node,3);
        if(node!=null){
            while (node!=null){
                System.out.print("->"+node.getValue());
                node=node.getNext();
            }
        }
    }
    private static Node reverse(Node head,int k){
        Node current=head;
        Node prevTail=null;
        Node prevCurrent=head;
        while (current!=null){
            int count=k;
            Node tail=null;
            while (count>0&&current!=null){
                Node next = current.getNext();
                current.setNext(tail);
                tail=current;
                current=next;
                count--;
            }
            if(prevTail!=null){
                prevTail.setNext(tail);
            }else {
                head=tail;
            }
            prevTail=prevCurrent;
            prevCurrent=current;
        }
        return head;
    }
}
