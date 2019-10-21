package com.heap;

import java.util.Arrays;

public class Heap {
    private int capacity;
    private int size;
    private int[] heap;
    private int height;
    private HeapType heapType;

    public Heap(int capacity,HeapType heapType){
        this.capacity=capacity;
        this.heapType=heapType;
        heap=new int[capacity];
    }
    public int getSize() {
        return size;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public HeapType getHeapType() {
        return heapType;
    }

    public void setHeapType(HeapType heapType) {
        this.heapType = heapType;
    }

    public int parent(int childIndex){
        if(childIndex>=size||childIndex<=0) return -1;
        else return (childIndex-1)/2;
    }

    public int leftChild(int parentIndex){
        int leftChildIndex=2*parentIndex+1;
        if(parentIndex<0||leftChildIndex>=size){
            return -1;
        }
        return leftChildIndex;
    }

    public int rightChild(int parentIndex){
        int rightChildIndex=2*parentIndex+2;
        if(parentIndex<0||rightChildIndex>=size){
            return -1;
        }
        return rightChildIndex;
    }

    public int get(){
        if (size==0)return -1;
        return heap[0];
    }

    public void insert(int data){
        //heap[size++]=data;
        int lastIndex=size;
//        if(size==1)return;
//        else{
//            int parentIndex=(lastIndex-1)/2;
//            if(parentIndex>=0){
//                int parentValue=heap[parentIndex];
//                if(parentValue<data){
//                    //swap until < parent
//                }
//            }
//        }
        while (lastIndex>=0&&data>heap[(lastIndex-1)/2]){
            heap[lastIndex]=heap[(lastIndex-1)/2];
            lastIndex=(lastIndex-1)/2;
        }
        heap[lastIndex]=data;
        size++;
    }

    public static void main(String[] args) {
        System.out.println(-1/2);
        int[] input = {10,20,15,12,40,25,18};
        heapifying(input,input.length);
    }
    private static void heapifying(int[] heap,int size){
        int capacity=heap.length;
        for(int i=size-1;i>=0;){
            int leftChildIndex = i*2+1;
            int rightChildIndex= leftChildIndex+1;
            if(leftChildIndex>size-1){
                //do nothing
                i--;
            }else{
                int parent = heap[i];
                int leftChild = heap[leftChildIndex];
                if(rightChildIndex>size-1){
                    if(parent>leftChild){
                        //do nothing
                    }else{
                        heap[i]=heap[leftChildIndex];
                        heap[leftChildIndex]=parent;
                    }
                    i--;
                }else{
                    int rightChild = heap[rightChildIndex];
                    if(leftChild>=rightChild){
                        if(parent<leftChild){
                            heap[i]=heap[leftChildIndex];
                            heap[leftChildIndex]=parent;
                            i=leftChildIndex;
                        }else{
                            i--;
                        }
                    }else{
                        if(parent<rightChild){
                            heap[i]=heap[rightChildIndex];
                            heap[rightChildIndex]=parent;
                            i=rightChildIndex;
                        }else{
                            i--;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(heap));
    }

    public void delete(int data){

    }
}

enum HeapType{
    MAX_HEAP,
    MIN_HEAP
}
