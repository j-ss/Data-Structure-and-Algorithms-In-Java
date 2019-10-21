package com.searching;

import java.util.HashMap;

public class FindDuplicateInArray {
    //1 use hash map
    //2 sort and check
    public static void main(String[] args) {
        int[] array = new int[]{4,8,3,7,0,9,1};
        usingHashing(array);
        usingSorting(array);
    }
    private static void usingHashing(int[] array){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:array) {
            if (map.containsKey(i)){
                int value = map.get(i);
                map.put(i,value+1);
            }else{
                map.put(i,1);
            }
        }
        map.forEach((key,value) -> {
            if(value>1) System.out.println("Hashing -> Duplicate present");
        });
    }
    private static void usingSorting(int[] array){
        quickSort(array,0,array.length-1);
//        for (int i:array) {
//            System.out.print(" "+i);
//        }
        checkRepetition(array);
    }
    private static void quickSort(int[] array,int start,int end){
        if(start<end){
            int pivotIndex = partition(array,start,end);
            quickSort(array,start,pivotIndex-1);
            quickSort(array,pivotIndex+1,end);
        }
    }
    private static int partition(int[] array,int start,int end){
        int pivotElement = array[end];
        int pivotIndex = start;
        for(;start<end;){
            if(array[start]<pivotElement){
                int temp = array[pivotIndex];
                array[pivotIndex] = array[start];
                array[start]=temp;
                pivotIndex++;
            }
            start++;
        }
        array[end] = array[pivotIndex];
        array[pivotIndex]=pivotElement;
        return pivotIndex;
    }
    private static void checkRepetition(int[] array){
        for (int i =0;i<array.length-1;i++) {
            if(array[i]==array[i+1]){
                System.out.println("Sorting -> Duplicate present");
                break;
            }
        }
    }
}
