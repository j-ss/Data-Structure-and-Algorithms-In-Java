package com.array;

import java.util.Arrays;

public class TappingRainWater {

    private static int[] input = {4,3,1,5,6,2,9,8};
    public static void main(String[] args) {
        logic(input);
    }
    //o(n) extra space
    private static void logic(int[] input){
        int[] leftMax = new int[input.length-1];
        leftMax[0]=0;
        for(int i=1;i<input.length-1;i++){
            leftMax[i]=Integer.max(leftMax[i-1],input[i-1]);
        }
        int[] rightMax = new int[input.length];
        rightMax[input.length-1]=0;
        for(int i=input.length-2;i>=0;i--){
            rightMax[i]=Integer.max(rightMax[i+1],input[i+1]);
        }

        System.out.println(Arrays.toString(leftMax));
        System.out.println(Arrays.toString(rightMax));


    }
}
