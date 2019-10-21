package com.sorting;

public class SelectionSort {
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
        list=selectionSort(list);
        for (int i:list) {
            System.out.print(i+" ");
        }
    }
    public static int[] selectionSort(int[] input){
        for(int i =0;i<input.length-1;i++){
            int min = i;
            for(int j=i+1;j<input.length;j++){
                if(input[min]>input[j]){
                    min = j;
                }
            }
            int temp = input[i];
            input[i]=input[min];
            input[min] = temp;
        }
        return input;
    }
}
