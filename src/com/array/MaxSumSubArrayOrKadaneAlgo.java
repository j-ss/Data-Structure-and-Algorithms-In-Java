package com.array;

public class MaxSumSubArrayOrKadaneAlgo {

    private static void withoutSorting(int[] input){
        int maxEndHere=0;
        int maxSoFar=Integer.MIN_VALUE;
        for(int i=0;i<input.length;i++){
//            maxEndHere+=input[i];
//            if(maxEndHere<input[i]){
//                maxEndHere=input[i];
//            }
            maxEndHere=Integer.max(input[i],maxEndHere+input[i]);
            if(maxSoFar<maxEndHere){
                maxSoFar=maxEndHere;
            }
        }
    }
}
