package com.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/*
* lambada expression put extra level of interaction .
*  they increase the size of class and if not compile by jit then performance issue also  but not considerable
*
* default method are add due to facilate inteface evolution.
* */
public class PlatWithConsumer {

    public static void main(String[] args) {
        Consumer<String> consumer = (value)-> System.out.println(value+"consumer1");
        Consumer<String> consumer1 = System.out::println;

        consumer.accept("Consumer");
        Consumer<String> consumer2 = consumer.andThen((value)-> System.out.print(value+"consumer2"));
        Consumer<String> consumer3 = consumer.andThen(System.out::println);
        consumer2.accept("Consumer2");
        new HashMap<>();
    }
    //consumer examples
    public static void clearList(){
        List<String> list = Arrays.asList("1","2");
        Consumer<List<String>> consumer = List::clear;
        Consumer<List<String>> consumer1 = value -> value.clear();
        consumer.accept(list);
    }

    public static void addElementInList(){
        Consumer<List<String>> consumer1 = (list) -> list.add("first");
        Consumer<List<String>> consumer2 =  (list) -> list.add("second");

        //its  about chaining of function
        consumer1.andThen(consumer2).accept(Arrays.asList("1","2"));
    }

}

@FunctionalInterface
interface Consumer<T>{
     void accept(T t);
     default Consumer<T> andThen(Consumer<T> after){
         return (T t)->{
             this.accept(t);
             after.accept(t);
         };
     }
}