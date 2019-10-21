package com.string;
//O(n+m)  find prefix and suffix in pattern (repetition of char)
public class Kmp {



    private static void prefixTableFunction(String pattern,int[] lts){
        int patternLength = pattern.length();
        int rightPointer=1;
        lts[0] = 0;
        int leftPointer = 0;
        while (rightPointer<patternLength){
            if(pattern.charAt(leftPointer) == pattern.charAt(rightPointer)){
                leftPointer++;
                lts[rightPointer]=leftPointer;
                rightPointer++;
            }else{
                if(leftPointer!=0){
                    leftPointer=lts[leftPointer-1];
                }else{
                    lts[rightPointer]=leftPointer;
                    rightPointer++;
                }
            }
        }
    }

    private static void search(String text,String pattern,int[] lps){
        int patternLength = lps.length;
        int j=0;
        for(int i=0;i<text.length();){
            if(text.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
                if(j==patternLength){
                    System.out.println("match at index(index started from 0)"+(i-j));
                    j=lps[j-1];
                }
            }
            else if(j!=0){
                j=lps[j];
            }else {
                i++;
            }
        }
    }
    public static void main(String args[]) {
       String text = "abcdaeabefabccd";
       String pattern = "abcc";
       int[] lps = new int[pattern.length()];
       prefixTableFunction(pattern,lps);
       search(text,pattern,lps);
    }
}
