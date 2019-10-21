package com.searching;

import java.util.HashMap;

public class SumOfPairEqualToGivenNo {


    public static void main(String[] args) {
    }

    private static void hashLogic(int[] input,int data){
        if(input.length==1)return;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<input.length;i++){
            int temp=data-input[i];
            if(map.containsKey(input[i])){
                System.out.println("found");
            }else{
                map.put(temp,i);
            }
        }
    }
}
