package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfaceEx {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;

        consumer.accept("Hello");

        //a consumer calling two other consumer
        TestConsumer<List<String>> testConsumer1 = list -> list.add("one");
        TestConsumer<List<String>> testConsumer2 = list -> list.add("two");
        TestConsumer<List<String>> testConsumer = testConsumer1.addThen(testConsumer2);
        testConsumer.accept(Arrays.asList("Zero"));


        TestPredicate<String> predicate = String::isEmpty;
        predicate.test("");
        TestPredicate<String> predicate1 = string -> {
            return string.isEmpty();
        };
        predicate1.test("Hello");
        TestPredicate<String> predicate2 = predicate.negate();
        predicate2.test("jonig");

    }
}

@FunctionalInterface
interface TestConsumer<T>{
    void accept(T t);
    default TestConsumer<T> addThen(TestConsumer<T> t){
        return (T arg) -> {this.accept(arg); t.accept(arg);};
    }
}

@FunctionalInterface
interface TestPredicate<T>{
    boolean test(T t);

    default TestPredicate<T> negate(){
        return (T t)->{
            return !this.test(t);
        };
    }
}
