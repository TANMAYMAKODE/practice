package com.tanmay.DSA.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Stream4 {

    public static void main(String[] args) {
        // create a list of numbers using List.of()
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 2);  // Create a list of numbers
        var out = numbers.stream().map(n -> n * n).toList();
        System.out.println("Square of Each Number : "+out); // Output: [1, 4, 9, 16, 25]
        var out2 = numbers.stream().map(n -> n % 2==0 ).toList();
        System.out.println("Even Numbers : "+out2); // Output: [false, true, false, true, false]
        var out3 = numbers.stream().filter(n -> n % 2==0 ).toList();
        System.out.println("Filter Even Numbers : "+out3); // Output: [2, 4, 2]
        var out4 = numbers.stream().filter(n -> n % 2==0 ).collect(Collectors.toSet());
        System.out.println("Filter Even Numbers : "+out4); // Output: [2, 4]

    }
}
