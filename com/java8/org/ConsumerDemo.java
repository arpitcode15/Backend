package com.java8.org;
// Void Return Type
// It only consumes

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<String> print = x -> System.out.println(x);
        Consumer<String> print2 = x -> System.out.println(2 + x);

        print.andThen(print2).accept("Arpit");

    }
}
