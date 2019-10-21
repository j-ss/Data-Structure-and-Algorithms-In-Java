package com.sorting;

public class MergeTwoSortedArray {

    static int[] array1= {1,4,6,8,9,15};
    static int[] array2= {2,3,7,10,14,17};
    public static void main(String[] args) {
        int[] temp = mergeTwoSortedArrayWithTempArray(array1,array2);
//        for(int i:temp){
//            System.out.print("- "+i);
//        }

        for(int i:array1){
            System.out.print("- "+i);
        }
        System.out.println();
        for(int i:array2){
            System.out.print("- "+i);
        }
        System.out.println();
        mergeTwoSortedArrayInPlace(array1,array2);
        for(int i:array1){
            System.out.print("- "+i);
        }
        System.out.println();
        for(int i:array2){
            System.out.print("- "+i);
        }
    }

    private static int[] mergeTwoSortedArrayWithTempArray(int[] array1,int[] array2){
        int[] temp = new int[20];
        int k=0;
        int i=0,j=0;
        for(;i<array1.length&&j<array2.length;){
             if(array1[i]>array2[j]){
                 temp[k++]=array2[j];
                 j++;
             }else{
                 temp[k++]=array1[i];
                 i++;
             }
        }

        while(i<array1.length){
            temp[k++]=array1[i++];
        }
        while(j<array2.length){
            temp[k++]=array2[j++];
        }
        return temp;
    }

    private static void mergeTwoSortedArrayInPlace(int[] array1,int[] array2){
        for(int i=0;i<array1.length;i++){
            if(array1[i]>array2[0]){
                int temp = array1[i];
                array1[i] = array2[0];
                array2[0] = temp;

                for(int k=1;k<=array2.length;k++){
                    if(array2[k-1]>array2[k]){
                        int temp1 = array2[k-1];
                        array2[k-1] = array2[k];
                        array2[k] = temp1;
                    }else{
                        break;
                    }
                }
            }
        }
    }
}
