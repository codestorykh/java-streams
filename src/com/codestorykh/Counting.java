package com.codestorykh;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Counting {

    public static void main(String[] args) {
        List<MockData.Student> students = MockData.students();

        Map<String, Long> gradeCounts = students.stream()
                .collect(Collectors.groupingBy(student -> {
                    if (student.getGrade() >= 85) return "A";
                    else if (student.getGrade() >= 70) return "B";
                    else if (student.getGrade() >= 50) return "C";
                    else return "D";
                }, Collectors.counting()));

        System.out.println("ចំនួនក្រុមនៃថ្នាក់:");
        gradeCounts.forEach((grade, count)
                -> System.out.println(grade + ": " + count));
    }
}
