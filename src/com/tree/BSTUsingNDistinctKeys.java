package com.tree;

public class BSTUsingNDistinctKeys {
    //dynamic programming question
    //in dynamic programming we memorize the previous steps solution
    private static int logic(int keys){
        int[] no = new int[keys+1];
        no[0]=no[1]=1;
        for(int i=2;i<=keys;i++){
            no[i]=0;
            for(int j=0;j<i;j++){
                no[i]+=no[j]*no[i-j-1];
            }
        }
        return no[keys-1];
    }
}
