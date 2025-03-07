package com.java8.org;

import java.util.function.Supplier;

public class SupplierDemo {


    public static void main(String[] args) {
        Supplier<Integer> integerSupplier = () -> 2;
        System.out.println(integerSupplier.get());
    }
}
