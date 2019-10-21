package com.linkedlist;

public class DoublyLinkedListNode {
    private int value;
    private DoublyLinkedListNode previousNode;
    private DoublyLinkedListNode nextNode;

    DoublyLinkedListNode(int value){
        this.value =value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DoublyLinkedListNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoublyLinkedListNode previousNode) {
        this.previousNode = previousNode;
    }

    public DoublyLinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyLinkedListNode nextNode) {
        this.nextNode = nextNode;
    }
}
