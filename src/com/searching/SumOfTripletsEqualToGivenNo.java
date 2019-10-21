package com.searching;

public class SumOfTripletsEqualToGivenNo {

    private static void sortingLogic(int[] input,int data){
        if(input.length<3)return;
        //sort
        for(int i=0;i<input.length-2;i++){
            for(int j=i+1,k=input.length-1;j<k;){
                int sum=input[i]+input[j]+input[k];
                if(sum<data){
                    j++;
                }else if(sum>data){
                    k--;
                }else{
                    System.out.println("found");
                }
            }
        }
    }


}
