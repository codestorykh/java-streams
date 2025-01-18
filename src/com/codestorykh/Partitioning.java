package com.codestorykh;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioning {

    public static void main(String[] args) {
        List<Integer> numbers = MockData.integers();
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        //System.out.println(partitioned);

        List<MockData.Student> students = MockData.students();
        Map<Boolean, List<MockData.Student>> partitionedStudents = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getGrade() > 75));

        System.out.println("ជាប់:");
        partitionedStudents.get(true).forEach(System.out::println);

        System.out.println("\nធ្លាក់:");
        partitionedStudents.get(false).forEach(System.out::println);
    }
}
