package com.queue;

import java.util.Stack;

public class InplementQueueUsingTwoStack {

    Stack<Integer> queue = new Stack<>();
    Stack<Integer> temp = new Stack<>();

    public static void main(String[] args) {

    }

    void enQueue(int data){
        while (!queue.isEmpty()){
            temp.push(queue.pop());
        }
        queue.push(data);
        while (!temp.isEmpty()){
            queue.push(temp.pop());
        }
    }
    int deQueue(){
        return queue.pop();
    }

}
