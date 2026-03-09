package com.tanmay.DSA.streams;

public class Stream2 {

    public static void main(String[] args) {
        String input = "siewss";
        long count = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
                .count();
        System.out.println("Count of non-repeated characters: " + count); // Output: 3
    }
}
