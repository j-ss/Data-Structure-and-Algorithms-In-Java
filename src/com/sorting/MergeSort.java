package com.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] array= {1,5,3,7,4,9,0,2};

        for (int i:array) {
            System.out.print(i+"-");
        }
        System.out.println();
        sort(array,0,7);
        for (int i:array) {
            System.out.print(i+"-");
        }
    }
    private static void sort(int[] array,int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            sort(array,start,mid);
            sort(array,mid+1,end);
            //merge(array,start,mid,end);
            mergeTwoSortedArrayInPlace(array,start,mid,end);
        }
    }

    private static void merge(int[] array,int start,int mid,int end){
        System.out.println("start "+start+" mid "+mid+" end "+end);
//        while(start<end){
//            for(;end>mid;end--){
//                if(array[end]<array[start]){
//                    int temp=array[end];
//                    array[end]=array[start];
//                    array[start]=temp;
//                }
//            }
//            start++;
//        }
    }
    private static void mergeTwoSortedArrayInPlace(int[] array,int start,int mid,int end){
        System.out.println("start "+start+" mid "+mid+" end "+end);
        for (int i:array) {
            System.out.print(i+"-");
        }
        System.out.println();
        for(;start<=mid;start++){
            if(array[start]>array[mid+1]){
                int temp = array[start];
                array[start] = array[mid+1];
                array[mid+1] = temp;
                for(int k=mid+2;k<=end;k++){
                    if(array[k-1]>array[k]){
                        int temp1 = array[k-1];
                        array[k-1] = array[k];
                        array[k] = temp1;
                    }else{
                        break;
                    }
                }
            }
        }
        for (int i:array) {
            System.out.print(i+"-");
        }
        System.out.println();
    }
}
