package com.codestorykh;

import java.util.List;
import java.util.Locale;

public class Transforming {

    public static void main(String[] args) {
        List<String> weekDays = MockData.weekDays();
        List<String> modifiedWeekDays = weekDays.stream()
                .map(day -> day.toUpperCase(Locale.ROOT))
                .toList();

        modifiedWeekDays.forEach(System.out::println);

        List<MockData.Person> peoples = MockData.persons();
        List<String> modifiedPeoples = peoples.stream()
                .filter(person -> person.getAge() > 30)
                .map(MockData.Person::getName)
                .toList();
        modifiedPeoples.forEach(System.out::println);

    }
}
