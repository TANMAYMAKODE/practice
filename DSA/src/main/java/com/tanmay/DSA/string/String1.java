package com.tanmay.DSA.string;

public class String1 {

    public static void main(String[] args) {
        String str = "HelloWorld ";
        System.out.println(str.length());  // Output: 11
        System.out.println(str.charAt(0));  // Output: H
        System.out.println(str.substring(0, 5));  // Output: Hello
        System.out.println(str.indexOf('W')); // Output: 5
        System.out.println(str.contains("World"));  // Output: true
        System.out.println(str.replace("World", "Java")); // Output: HelloJava
        System.out.println(str.toLowerCase());  // Output: helloworld
        System.out.println(str.toUpperCase()); // Output: HELLOWORLD
        System.out.println(str.trim()); // Output: HelloWorld (no leading or trailing whitespace)
    }
}
