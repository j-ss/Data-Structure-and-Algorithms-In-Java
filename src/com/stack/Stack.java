package com.stack;

public class Stack {
    int capacity;
    int top=-1;
    int[] stack;
    Stack(int capacity){
        this.capacity=capacity;
        this.stack = new int[capacity];
    }
    Stack(){
        this(10);
    }

    int size(){
        return top+1;
    }
    boolean isEmpty(){
        return top<0;
    }
    void push(int data){
        if(top>=capacity){
            System.out.println("full");
        }else {
            stack[++top]=data;
        }
    }
    int pop(){
        return stack[top--];
    }
    int top(){
        return stack[top];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<size();i++){
            stringBuilder.append("->"+stack[i]);
        }
        return stringBuilder.toString();
    }
}
