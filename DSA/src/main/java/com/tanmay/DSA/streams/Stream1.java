package com.tanmay.DSA.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

    public static void main(String[] args) {


        String input = "siewss";
        Optional<Character> firstNonRepeated = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
                .findFirst();
        System.out.println(firstNonRepeated.orElse(null)); // Output: i


        Optional<Character> out = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c)).sorted()
                .findFirst();
        System.out.println(out.orElse(null)); // Output: e
    }
}
