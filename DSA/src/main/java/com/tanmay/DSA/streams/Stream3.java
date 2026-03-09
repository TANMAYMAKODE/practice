package com.tanmay.DSA.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream3 {

    public static void main(String[] args) {
        // Create a list of strings using Arrays.asList()
        List<String> list = Arrays.asList("fun", "hello", "world", "java", "stream", "programming", "code", "developer", "software", "engineer");
        // Grouping the strings by their length using method reference

        Map<Integer, List<String>> groupedByLength = list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Using Map 1:" + groupedByLength);
// Output : Using Map 1:{3=[fun], 4=[java, code], 5=[hello, world], 6=[stream], 8=[software, engineer], 9=[developer], 11=[programming]}

        Map<Integer, List<String>> groupedByLength2 = list.stream()
                .collect(Collectors.groupingBy(s -> s.length()));
        System.out.println("Using Map 2:" + groupedByLength2);
// Output : Using Map 2:{3=[fun], 4=[java, code], 5=[hello, world], 6=[stream], 8=[software, engineer], 9=[developer], 11=[programming]}

        var out = list.stream().collect(Collectors.groupingBy(String::length, Collectors.toList()));
        System.out.println("Stream 3:" + out);
// Output : Stream 3:{3=[fun], 4=[java, code], 5=[hello, world], 6=[stream], 8=[software, engineer], 9=[developer], 11=[programming]}
    }
}
