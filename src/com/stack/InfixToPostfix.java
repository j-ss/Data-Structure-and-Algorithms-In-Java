package com.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InfixToPostfix {

    public static void main(String[] args) {
        String expression1 = "A+B-(c*d)*A";
        String expression2 = "A*B-(C+D)+E";
        convert(expression2);
    }
    private static void convert(String expression){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<expression.length();i++){
            Character c = expression.charAt(i);
            if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
                System.out.print(c);
            }else if(c==')'){
                while (stack.peek()!='(')
                System.out.print(stack.pop());
                stack.pop();
            }else{
                if(c=='('||(!stack.isEmpty() && stack.peek()=='(')) {
                    stack.push(c);
                }else if(!stack.isEmpty() && priority(c,stack.peek())<=0){
                    System.out.print(stack.pop());
                    stack.push(c);
                }else{
                    stack.push(c);
                }
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
    private static int priority(Character c1,Character c2){
        Map<Character,Integer> map = new HashMap();
        map.put('+',1);
        map.put('-',1);
        map.put('*',2);
        map.put('/',2);

        int priority1= map.get(c1);
        int priority2= map.get(c2);
        if(priority1<=priority2){
            return -1;
        }else{
            return 1;
        }
    }
}
