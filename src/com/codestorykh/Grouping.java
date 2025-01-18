package com.codestorykh;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {

    public static void main(String[] args) {
        List<MockData.Person> persons = MockData.persons();

        Map<Integer, List<MockData.Person>> groupedByLength = persons.stream()
                .collect(Collectors.groupingBy(p -> p.getName().length()));

        groupedByLength.forEach((key, value) -> {
            System.out.println("Length: " + key);
            value.forEach(p -> System.out.println(p.getName()));
            System.out.println();
        });
    }
}
