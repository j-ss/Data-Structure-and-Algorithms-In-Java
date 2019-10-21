package com.searching;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{3,5,6,8,9,12},6));
    }

    private static int binarySearch(int[] array,int searchElement){
        int start=0;
        int end = array.length;
        int mid;
        while(start<end){
            mid = start+(end-start)/2;
            if(searchElement>array[mid]){
                start = mid+1;
            }
            else if(searchElement==array[mid]){
                return mid;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
