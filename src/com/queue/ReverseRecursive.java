package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseRecursive {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        reverse(queue);
        for (int i:queue) {
            System.out.println(i);
        }
    }
    static void reverse(Queue<Integer> queue){
        if(queue.isEmpty())return;
        int temp = queue.poll();
        reverse(queue);
        queue.offer(temp);
    }
}
