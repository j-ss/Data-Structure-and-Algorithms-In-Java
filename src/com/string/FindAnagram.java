package com.string;
//if frequency of character are same in two string
public class FindAnagram {
    public static void main(String[] args) {
        logic("geeksforgeeks","foreekseeks");
    }
    protected static void logic(String input,String search){
        //make a count array of 256 char and inc and dec the count if all are zero then anagram
        int[] array = new int[256];
        for(int i=0;i<input.length();i++){
            array[input.charAt(i)] ++;
        }
        for(int i=0;i<search.length();i++){
            array[search.charAt(i)] --;
        }

        for (int i:array){
            System.out.print(" "+i);
            if(i>0){
                System.out.println("Not anagram");
                break;
            }
        }
    }
}
