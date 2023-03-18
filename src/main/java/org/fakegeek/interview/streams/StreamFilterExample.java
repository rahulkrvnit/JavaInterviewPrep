package org.fakegeek.interview.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("c"))
                .collect(Collectors.toList());

        System.out.println("Original List: " + fruits);
        System.out.println("Filtered List: " + filteredFruits);
    }
}

