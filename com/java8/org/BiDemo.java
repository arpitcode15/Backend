package com.java8.org;

import java.util.function.BiFunction;

public class BiDemo {
    public static void main(String[] args) {
//        Func to add the length of two strings and return it
        BiFunction<String, String, Integer> biFunction = (a, b) -> a.length() + b.length();
        Integer out = biFunction.apply("Arpit", "Shrivastava");
        System.out.println(out);
    }
}
