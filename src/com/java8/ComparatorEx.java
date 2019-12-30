package com.java8;

import java.util.Comparator;
import java.util.function.Function;

public class ComparatorEx {
    public static void main(String[] args) {
        Comparator<Person> comparator = Comparator.comparing(Person::getLname)
                .thenComparing(Person::getFname)
                .thenComparing(Person::getAge);

        CustomComparator<Person> customComparator = (t1,t2) -> t1.fname.compareTo(t2.fname);
        CustomComparator<Person> customComparator1 = CustomComparator.comparing(Person::getFname);
    }
}

@FunctionalInterface
interface CustomComparator<T>{
    int compare(T t1,T t2);

    static <T,R extends Comparable<R>> CustomComparator<T> comparing(Function<T,R> function){
        return (t1,t2)-> {
          R r1 = function.apply(t1);
          R r2 = function.apply(t2);
          return r1.compareTo(r2);
        };
    }
}
class Person{
    String fname;
    String lname;
    Integer age;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
