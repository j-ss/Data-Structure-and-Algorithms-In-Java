package com.string;

import java.util.ArrayList;
import java.util.Comparator;

//find permutation and sort a string
public class FindPermutationOfString {

    public static void main(String[] args) {
        logic("abdc");
    }
    protected static void logic(String input){
        ArrayList<String> result = new ArrayList<>();
        permutation("",input,result);
        System.out.println(result);
        result = sort(result);
        System.out.println(result);
    }
    private static void permutation(String prefix, String suffix, ArrayList<String> result){
        if(suffix.length()==0){
            result.add(prefix);
        }else{
            for(int i=0;i<suffix.length();i++){
                permutation(prefix+suffix.charAt(i),suffix.substring(0,i)+suffix.substring(i+1,suffix.length()),result);
            }
        }
    }

    private static ArrayList<String> sort(ArrayList<String> input){
        input.sort(String::compareTo);
        return input;
    }
}

//given two string find permutation of second string is present in first or not