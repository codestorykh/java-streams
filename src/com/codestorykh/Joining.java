package com.codestorykh;

import java.util.List;
import java.util.stream.Collectors;

public class Joining {

    public static void main(String[] args) {
        List<MockData.Student> students = MockData.students();

        String studentNames = students.stream()
                .map(MockData.Student::getName)
                .collect(Collectors.joining(", "));

        System.out.println(studentNames);
    }
}
