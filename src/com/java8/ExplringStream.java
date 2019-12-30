package com.java8;

import java.util.Arrays;
import java.util.List;

public class ExplringStream {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,34,5,6);
        input.stream()
                .filter(v-> {
                    if(v>5){
                        return true;
                    } else {
                        return false;
                    }
                });
    }
}
