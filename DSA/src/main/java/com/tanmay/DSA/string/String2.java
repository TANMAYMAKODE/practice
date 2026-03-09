package com.tanmay.DSA.string;

public class String2 {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenation: " + concat); // Output: Hello World

        // Comparison
        boolean isEqual = str1.equals(str2);
        System.out.println("Are strings equal? " + isEqual);  // Output: Are strings equal? false

        // Iteration
        System.out.print("Characters in str1: "); // Output: Characters in str1: H e l l o
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i) + " ");
        }
    }
}
