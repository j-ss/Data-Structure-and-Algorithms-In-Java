package com.sorting;


import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
* It detect weather input is sorted or not.
* Its complexity is Big(n^2)
* use int instead of integer for better performance.
* */
public class BubbleSort {
    static int[] list= new int[6];
    static{
        list[0]=1;
        list[1]=9;
        list[2]=7;
        list[3]=2;
        list[4]=5;
        list[5]=0;
    }
    public static void main(String[] args) {
        System.out.println("Before Sorting");
        for (int i:list) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("After Sorting");
        list=bubbleSort1(list);
        for (int i:list) {
            System.out.print(i+" ");
        }
    }

    public static int[] bubbleSort(int[] array){
        int counter=0;
        //This approach is better then last one. 15
//        for (int i=0;i<array.length-1;i++) {
//            for(int j=i+1;j<array.length;j++){
//                counter++;
//                if(array[i]>array[j]){
//                    int temp=array[j];
//                    array[j]=array[i];
//                    array[i]=temp;
//                }
//            }
//        }
        for (int i=0;i<array.length-1;i++) {
            int min=i;
            for(int j=i+1;j<array.length;j++){
                counter++;
                if(array[min]>array[j]){
                    min=j;
                }
            }
            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;
        }
        //25
//        for (int i=0;i<array.length-1;i++) {
//            for(int j=0;j<array.length-1;j++){
//                counter++;
//                if(array[j]>array[j+1]){
//                    int temp=array[j];
//                    array[j]=array[j+1];
//                    array[j+1]=temp;
//                }
//            }
//        }
        System.out.println(counter);
        return array;
    }

    public static int[] bubbleSort1(int[] input){
        int counter=0;
        for (int i =0;i<input.length-1;i++){
            //int min = input[i];
            for(int j=0;j<input.length-i-1;j++){
                counter++;
                if(input[j]>input[j+1]){
                    int temp = input[j+1];
                    input[j+1] = input[j];
                    input[j] = temp;
                }
            }
        }
        System.out.println(counter);
        return input;
    }
}
