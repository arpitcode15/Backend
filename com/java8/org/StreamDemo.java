package com.java8.org;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

//        Ways to create stream
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream1 = list.stream();

        String[] str = {"Arpit", "Shrivastava"};
        Stream<String> stream2 = Arrays.stream(str);

        Stream<Integer> stream3 = Stream.of(1, 2, 3, 5);

//        seed is starting point
        Stream<Integer> stream4 = Stream.iterate(1, x -> x + 1).limit(100);

//        Using generate
        Stream.generate(() -> (int) Math.random() * 100).limit(2);


    }
}
