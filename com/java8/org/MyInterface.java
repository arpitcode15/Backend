package com.java8.org;

@FunctionalInterface
public interface MyInterface {

    public static void sayHi() {

    }

    public void sayHello();

    default void sayBye() {

    }


}
