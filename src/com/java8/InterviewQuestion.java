package com.java8;

import com.linkedlist.InsertAtLast;
import com.linkedlist.Node;

import java.util.*;

public class InterviewQuestion {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(7,2,8);
        List<Integer> list2 = Arrays.asList(8,5,5);
        List<Integer> output = null;
        //output = logic1(list1,list2); //logic1 to find sum of two linked list
        output = logic2(list1,list2);   //logic two to find sum of two linked list
        System.out.println(output);
    }

    private static List<Integer> logic1(List<Integer> head1,List<Integer> head2){
        StringBuilder number1= new StringBuilder("");
        StringBuilder number2= new StringBuilder("");

        for(int i=0;i<head1.size();i++){
            number1.append(head1.get(i));
        }
        for(int i=0;i<head2.size();i++){
            number2.append(head2.get(i));
        }
        System.out.println("number1 is "+number1+" number2 is"+number2);

        Integer number3 = Integer.parseInt(number1.toString())+Integer.parseInt(number2.toString());
        System.out.println("Sum of above two no is "+number3);
        return convertNumberIntoList(number3);
    }

    private static List<Integer> logic2(List<Integer> head1,List<Integer> head2){
        Integer number1 = head1.stream()
                .reduce(0,(t,v)->(t*10)+v);
        Integer number2 = head2.stream()
                .reduce(0,(t,v)->(t*10)+v);
        System.out.println("Number 1 is "+number1+"Number 2 is "+number2+"\nSum of no is "+(number1+number2));
        return convertNumberIntoList(number1+number2);
    }

    private static List<Integer> convertNumberIntoList(Integer input){
        //There are 3 method to convert a number back into linked list  eg 4534 into [4,5,3,4]
        List<Integer> result = null;
        //one method is  use stack
        result= stackImplementation(input);
        //second use recursion handle special case when input is 0 if sum is -ve then send abs of sum
        result = new LinkedList<>();
        if(input==0) result = Arrays.asList(input);
        usingRecursion(Math.abs(input),result);
        //third one is first construct a linked list then reverse it. its much more like stack.
        result = usingReverseList(input);
        return result;
    }
    private static List<Integer> stackImplementation(Integer input){
        if(input==0) return Arrays.asList(input); //special case when sum of two list is 0;
        Stack<Integer> stack = new Stack<>();
        do{
            System.out.println(input%10);
            stack.push(input%10);
            input/=10;
        }while (input>0);
        //convert stack into linked list
        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

    private static void usingRecursion(Integer input,List<Integer> result){
        if (input == 0) return;
        int remainder = input % 10;
        usingRecursion(input / 10, result);
        result.add(remainder);
    }
    private static List<Integer> usingReverseList(Integer input){
        if(input==0) return Arrays.asList(input);
        List<Integer> list = new LinkedList<>();
        do{
            list.add(input%10);
            input/=10;
        }while (input>0);
        //we ask interviewee to implement data structure on its own not from lib.
        //if we use library method then we use below method to reverse.otherwise see commented code
        for(int i=0,j=list.size()-1;i<j;i++,j--){
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
        }
        return list;
    }
}

/*
there is one more method if we are using java lib for linked list then we start from end side and construct list
its similar to solution provided by today interviewee.
other wise in singly linked list we cant traverse from tail to head.
 */


//public class ReverseLinkedList {
//
//    public static void main(String[] args) {
//        InsertAtLast.createNode();
//        Node node = InsertAtLast.head;
//        node = reverse(node);
//        if(node!=null){
//            while (node!=null){
//                System.out.print("->"+node.getValue());
//                node=node.getNext();
//            }
//        }
//    }
//    private static Node reverse(Node node){
//        Node head=null;
//        while(node.getNext()!=null){
//            Node temp = node;
//            node=node.getNext();
//            if(head==null)
//                temp.setNext(null);
//            else{
//                temp.setNext(head);
//            }
//            head=temp;
//        }
//        node.setNext(head);
//        return node;
//    }
//}
