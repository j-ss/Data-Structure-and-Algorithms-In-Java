package com.queue;

public class Queue {
    int front, rear = 0;
    int[] queue;
    int size = 0;

    public Queue() {
        this.queue = new int[10];
    }

    void enQueue(int data){
        if(size<10){
            queue[rear]=data;
            size++;
            rear=(rear+1)%10;
        }else{
            throw new IllegalStateException("Stack is full");
        }
    }
    int deQueue(){
        if(size==0){
            throw new IllegalStateException("stack is empty");
        }else{
            size--;
            int data = queue[front];
            queue[front]=Integer.MIN_VALUE;
            front = (front+1)%10;
            return data;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<size;i++){
            builder.append(queue[(front+i)%10]);
        }
        return builder.toString();
    }
}
