package com.array;

/*
* Equlibirium point where sun of left and right is equal
* */
public class FindEquilibiriumPoint {

    //brute force
    //using prefix array technique(using O(n) extra space or using o(1) extra space)

    private static void logic(int[] input){
        int maxSum = Integer.MIN_VALUE;
        for (int i:input) {
            maxSum+=i;
        }
        int leftSum=0;
        int currSum=0;
        for (int i=0;i<input.length;i++){
            currSum+=input[i];
            if(leftSum==(maxSum-currSum)){
                System.out.println("Equlibirium point is"+i);
            }
            leftSum=currSum;
        }
    }

}
