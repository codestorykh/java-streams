package com.codestorykh;

import java.util.List;
import java.util.Optional;

public class Finding {

    public static void main(String[] args) {
        List<MockData.Person> peoples = MockData.persons();

        Optional<String> username = peoples.stream()
                .filter(person -> person.getAge() > 18)
                .map(MockData.Person::getName)
                .findFirst();
        username.ifPresent(System.out::println);

        long start1 = System.currentTimeMillis();
        Optional<String> username2 = peoples.stream()
                .map(MockData.Person::getName)
                .filter(name -> name.contains("O"))
                .findFirst();
        long end1 = System.currentTimeMillis();
        System.out.println("Time taken 1 : " + (end1 - start1) + "ms");
       username2.ifPresent(System.out::println);

        long start = System.currentTimeMillis();
        Optional<String> username3 = peoples.parallelStream()
                //.peek(name -> System.out.println("Thread: " + Thread.currentThread().getName()))
                .map(MockData.Person::getName)
                .filter(name -> name.contains("O"))
                .findAny();
        long end = System.currentTimeMillis();
       System.out.println("Time taken: " + (end - start) + "ms");
       username3.ifPresent(System.out::println);
    }
}
