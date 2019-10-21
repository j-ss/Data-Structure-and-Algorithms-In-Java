package com.searching;

public class FindMissingNoInARange {
    public static void main(String[] args) {
        int[] input = {1,2,4,3,5,8,7};
        System.out.println(findMissingNo(input,1,8));
        int[] input1 = {1,1,2,2,4,4,3,3,5,5,8,8,7};
        findOddOccurringNo(input1);
        findElementWhichIsRepeatingTwice(input1);
    }

    private static int findMissingNo(int[] array,int rangeStart,int rangeEnd){
        int sum = 0;
        while (rangeStart<=rangeEnd){
            sum ^= rangeStart;
            rangeStart++;
        }
        int sum2 =0;
        for (int i:array) {
            sum2 ^=i;
        }
        return sum^sum2;
    }

    private static void findOddOccurringNo(int[] array){
        int number = 0;
        for (int i:array) {
            number ^=i;
        }
        System.out.println(number);
    }

    private static void findElementWhichIsRepeatingTwice(int[] input){
        int sum = 0;
        for(int i=1;i<=8;i++){
            sum ^=i;
        }
        for (int i:input) {
            sum ^=i;
        }
        System.out.println(sum);
    }
}
