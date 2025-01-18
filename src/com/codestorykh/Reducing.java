package com.codestorykh;

import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {
        List<Integer> integers = MockData.integers();
        Optional<Integer> max = integers.stream()
                .reduce((a, b) -> a > b ? a : b);

        if(max.isPresent()){
            System.out.println("Max: " + max.get());
        } else {
            System.out.println("No data");
        }

        int sum = integers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
    }
}
