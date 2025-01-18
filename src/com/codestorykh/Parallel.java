package com.codestorykh;

import java.util.List;

public class Parallel {

    public static void main(String[] args) {
        List<Integer> numbers = MockData.integers();
        int sumOfSquares = numbers.stream()
                .parallel()
                .mapToInt(n -> n * n)
                .sum();

        System.out.println("Sum of squares: " + sumOfSquares);


        List<MockData.Order> orders = MockData.orders();
        double total = orders.parallelStream()
                .mapToDouble(MockData.Order::calculateTotal)
                .sum();

        System.out.println("Total Price: " + total);
    }
}
