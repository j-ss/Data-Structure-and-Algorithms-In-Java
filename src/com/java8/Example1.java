package com.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Example1 {

    public static <T> T anyObjects(){ return null;}

    public static void main(String[] args) {
        foo((List<String>) anyObjects());

        //lambada format
        Comparator<String> comparator = (obj1,obj2) -> obj1.length() - obj2.length();

        Comparator<String> comparator1 = Example1::customFun;
        //other way
        Comparator<String> comparator2 = Comparator.comparing((value)->value.toUpperCase());
        Comparator<String> comparator3 = Comparator.comparing(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return null;
            }
        });

    }

    public static void foo(List<String> list){

    }
    public static void foo(Set<String> list){

    }
    
    private static Integer customFun(String s1,String s2){
        return s1.length()-s2.length();
    }
}

//Type infred - detect type automatically.
