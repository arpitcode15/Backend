package com.java8.org;

// It is used when input and output are of same type
// BTS it uses function only and provide the arguments as same

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorDemo {

    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = x -> x * 2;
        System.out.println(unaryOperator.apply(30));

        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("Arpit", "Shrivastava"));
    }


}
