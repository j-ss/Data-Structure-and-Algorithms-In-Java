package com.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array= {12,5,3,7,4,9,0,2};

        for (int i:array) {
            System.out.print(i+"-");
        }
        System.out.println();
        for (int i:sort2(array)) {
            System.out.print(i+"-");
        }
    }
    private static int[] sort(int[] array){
        for(int i=1;i<array.length;i++){
            for(int j=i;j>=1;j--){
                if(array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
        return array;
    }
    private static int[] sort2(int[] input){
        for(int i=1;i<input.length;i++){
            int min=i;
            for(int j=i-1;j>=0;j--){
                if(input[min]<input[j]){
                    int temp = input[min];
                    input[min] = input[j];
                    input[j] = temp;
                    min = j;
                }
            }
        }
        return input;
    }
}
