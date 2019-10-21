package com.stack;

import java.util.Stack;

public class FindSpanInStockMarket {

    public static void main(String[] args) {
        int[] span = findSpan(new int[]{4,5,10,6,7,11});
        for (int i:span) System.out.println(i);
    }

    private static int[] findSpan(int[] array){
        Stack<Integer> stack = new Stack<>();
        int[] span = new int[array.length];
        int p=0;
        for(int i=0;i<array.length;i++){
            while (!stack.isEmpty()&& array[i]>array[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                p=-1;
            }else p=stack.peek();

            span[i]=i-p;
            stack.push(i);
        }
        return span;
    }
}
