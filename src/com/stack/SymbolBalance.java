package com.stack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SymbolBalance {
    public static void main(String[] args) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        String expression = "{[(a+b)+(a-b)]";
        System.out.println(check(expression,stack));
    }

    private static boolean check(String expression,java.util.Stack<Character> stack){
        Character[] array = {'(','{','['};
        List<Character> symbols = Arrays.asList(array);
        for(int i=0;i<expression.length();i++){
            if(symbols.contains(expression.charAt(i))){
                stack.push(expression.charAt(i));
            }else if(expression.charAt(i)=='}'&&!stack.isEmpty()){
                if(stack.peek()=='{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
            else if(expression.charAt(i)==')'&&!stack.isEmpty()){
                if(stack.peek()=='('){
                    stack.pop();
                }else{
                    return false;
                }
            }
            else if(expression.charAt(i)==']'&&!stack.isEmpty()){
                if(stack.peek()=='['){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()) return true ;
        else return false;
    }
}
