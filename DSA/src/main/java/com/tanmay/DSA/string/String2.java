package com.tanmay.DSA.string;

public class String2 {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenation: " + concat);

        // Comparison
        boolean isEqual = str1.equals(str2);
        System.out.println("Are strings equal? " + isEqual);

        // Iteration
        System.out.print("Characters in str1: ");
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i) + " ");
        }
    }
}
