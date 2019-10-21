package com.array;

import java.util.Arrays;

public class RotateAnArrayWithoutExtraSpace {

    static int[] input = {1,2,3,4,5,6,7,8};

    public static void main(String[] args) {
        int rotateBy = 2;
        System.out.println(Arrays.toString(input));
        rotate(input,0,input.length-1);
        System.out.println(Arrays.toString(input));
        rotate(input,0,input.length-rotateBy-1);
        System.out.println(Arrays.toString(input));
        rotate(input,input.length-rotateBy,input.length-1);
        System.out.println(Arrays.toString(input));
    }

    private static void rotate(int[] array,int start,int end){
        while (start<end){
            int temp = array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }
}
