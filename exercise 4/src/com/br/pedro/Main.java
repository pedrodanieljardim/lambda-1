package com.br.pedro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("william", "jones", "aaron", "seppe", "frank", "gilliam", "mike", "ark", "white");
        names.stream().filter(namePredicate -> namePredicate.startsWith("a")).filter(namePredicate -> namePredicate.length() >= 3).collect(Collectors.toList()).forEach(System.out::println);


    }
}
