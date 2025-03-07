package com.java8.org;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRefDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Employee> collect = list.stream().map(Employee::new).collect(Collectors.toList());
        System.out.println(collect);

    }


}




