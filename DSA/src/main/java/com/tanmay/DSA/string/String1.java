package com.tanmay.DSA.string;

public class String1 {

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.substring(0, 5));
        System.out.println(str.indexOf('W'));
        System.out.println(str.contains("World"));
        System.out.println(str.replace("World", "Java"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
    }
}
