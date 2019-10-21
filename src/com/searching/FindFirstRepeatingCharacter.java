package com.searching;

import java.util.HashMap;

public class FindFirstRepeatingCharacter {
    public static void main(String[] args) {
        int[] input = new int[]{4,8,8,3,3,8,7,0,9,1};
        int index = findRepeatingChar(input);
        if(index!=input.length) System.out.println("Repeating element is "+input[index]);
        else System.out.println("No repeating char");
    }

    private static int findRepeatingChar(int[] array){
        int index = array.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                int value = map.get(array[i]);
                if(value<index){
                    index = value;
                }
            }else{
                map.put(array[i],i);
            }
        }
        return index;
    }
}
