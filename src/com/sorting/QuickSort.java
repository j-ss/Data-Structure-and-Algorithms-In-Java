package com.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] array= {1,5,3,7,4,9,0,2};

        for (int i:array) {
            System.out.print(i+"-");
        }
        System.out.println();
        partition(array,0,7);
        for (int i:array) {
            System.out.print(i+"-");
        }
    }

    private static void partition(int[] array,int start,int end){

        if (start<end){
            int index=quickSort(array,start,end);
            partition(array, start, index-1);
            partition(array, index+1, end);
        }
    }
    private static int quickSort(int[] array,int low,int high){
        int pivotIndex = low;
        int pivot = array[high];
        while(low<high){
            if(array[low]<pivot){
                int temp = array[low];
                array[low] = array[pivotIndex];
                array[pivotIndex] = temp;
                pivotIndex++;
            }
            low++;
        }
        array[high] = array[pivotIndex];
        array[pivotIndex] = pivot;
        return pivotIndex;
    }
}
