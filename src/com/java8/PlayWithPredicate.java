package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Phaser;

public class PlayWithPredicate {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("jogendra","singh");
        Map<String,String> map1 = new HashMap<>();
        map1.put("jogendra","singh");

        System.out.println(map.equals(map1));
        Map<Map<String,String>,Integer> map3= new HashMap();

        map3.put(map,1);
        map3.put(map1,3);

        System.out.println(map3.get(map));

        System.out.println(map3.containsKey(map1));

        System.out.println(1/0.0);
        int a=0;
        a=++a;
        System.out.println(a);

    }

    public static void predicateThatNeglecteAnotherPredicate(){
        //Predicate<String> predicate = (value)-> value.isEmpty();
        Predicate<String> predicate = String::isEmpty;
        Predicate<String> predicate1 = predicate.negate();
        predicate1.test("");
    }

    public static void predicateThatTellStringIsNotBlank(){
        Predicate<String> predicate1 = (t) -> !t.isEmpty();
        Predicate<String> predicate2 = Objects::nonNull;
        Predicate<String> predicate = predicate1.and(predicate2);
        predicate.test("");
    }
}

@FunctionalInterface
interface Predicate<T>{
    boolean test(T t);

    default Predicate<T> negate(){
        return (t)-> !this.test(t);
    }
    default Predicate<T> and(Predicate<T> p){
        //its better to add check
        Objects.requireNonNull(p);
        return (t)-> p.test(t) && this.test(t);
    }
    default Predicate<T> xor(Predicate<T> p){
        Objects.requireNonNull(p);
        return t -> this.test(t) ^ p.test(t);
        //return (t)-> (this.test(t) && p.test(t)) || (!this.test(t) && !p.test(t));
    }
}

