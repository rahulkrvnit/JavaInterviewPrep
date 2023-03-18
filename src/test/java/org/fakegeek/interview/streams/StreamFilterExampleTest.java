package org.fakegeek.interview.streams;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class StreamFilterExampleTest {

    @Test
    public void testFilter() {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("c"))
                .collect(Collectors.toList());

        assertEquals(1, filteredFruits.size());
        assertEquals("cherry", filteredFruits.get(0));
    }
}

