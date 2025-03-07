package com.java8.org;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        Predicate<String> startsWithLetterA = x -> x.toLowerCase().charAt(0) == 'a';
        System.out.println(startsWithLetterA.test("Arpit"));

        Predicate<String> endsWithT = x -> x.toLowerCase().charAt(x.length() - 1) == 't';

        Predicate<String> and = startsWithLetterA.and(endsWithT);
        Predicate<String> or = startsWithLetterA.or(endsWithT);

        System.out.println(or.test("Arpita"));
    }
}
