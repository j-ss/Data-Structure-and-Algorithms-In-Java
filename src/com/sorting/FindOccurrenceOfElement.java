package com.sorting;

import java.util.Arrays;
import java.util.Collections;

public class FindOccurrenceOfElement {
    public static void main(String[] args) {
        countOccurrence(new int[]{2,4,4,6,7,7,7,9});
    }

    private static void countOccurrence(int[] array){
        int maxCount= 1;
        int currentElement = array[0];
        int maxElement = array[0];
        int count =1;
        for(int i=1;i<array.length;i++){
            if(currentElement==array[i]){
                count++;
            }else {
                if(maxCount<count){
                    maxCount=count;
                    maxElement=currentElement;
                }
                count=1;
                currentElement=array[i];
            }
        }
        System.out.println("Element "+maxElement+" occurrence "+maxCount);
    }
}
