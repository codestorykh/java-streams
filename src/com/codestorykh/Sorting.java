package com.codestorykh;

import java.util.Comparator;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
        List<MockData.Person> persons = MockData.persons();

        List<String> sortedPersons = persons.stream()
                .sorted(Comparator.comparingInt(MockData.Person::getAge))
                .map(MockData.Person::getName)
                .toList();
        sortedPersons.forEach(System.out::println);

        System.out.println("=====================================");
        List<String> sortedPersons2 = persons.stream()
                .sorted(Comparator.comparing(MockData.Person::getName))
                .map(MockData.Person::getName)
                .toList();
        sortedPersons2.forEach(System.out::println);
    }
}
