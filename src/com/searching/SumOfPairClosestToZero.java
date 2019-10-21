package com.searching;

public class SumOfPairClosestToZero {

    private static int logic(int[] input){
        int left=0,right=input.length-1,negativeClosest=Integer.MIN_VALUE,
                positiveClosest=Integer.MAX_VALUE,temp=0;
        if(input.length==1){
            System.out.println("Invalid input");
            System.exit(0);
        }
        //sort array
        while (left<right){
            temp=input[left]+input[right];
            if(temp>0){
                right--;
                if(temp<positiveClosest) positiveClosest=temp;
            }else if(temp<0){
                left++;
                if(temp>negativeClosest) negativeClosest=temp;
            }else{
                System.out.println("Pair with zero sum"+input[left]+" "+input[right]);
            }
        }
        return Math.abs(negativeClosest)>positiveClosest?positiveClosest:negativeClosest;
    }
}
