package com.codestorykh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockData {

    public static List<String> namesInKhmer(){
        List<String> names = new ArrayList<>();
        names.add("សុក្រ");
        names.add("សុក្រ");
        names.add("សាន");
        names.add("សួស្តី");
        names.add("កំពង់ចាម");

        return names;
    }

    public static List<String> weekDays(){
        List<String> weekDays = new ArrayList<>();
        weekDays.add("Sunday");
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");

        return weekDays;
    }

    public static List<Integer> integers(){
        return List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<Person> persons(){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Sok", 25));
        persons.add(new Person("Say Hi", 30));
        persons.add(new Person("Ni Ni", 35));
        persons.add(new Person("Say Hello", 40));
        persons.add(new Person("Say Okay", 45));

        return persons;
    }

    public static class Student {
        String name;
        double grade;

        Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + " (" + grade + ")";
        }
    }

    public static List<Student> students() {

        return Arrays.asList(
                new Student("កាកា", 85),
                new Student("ឡាឡា", 55),
                new Student("សាសា", 90),
                new Student("តាតា", 70),
                new Student("សារី", 50)
        );
    }

    public static class Order {
        double price;
        double discount;

        Order(double price, double discount) {
            this.price = price;
            this.discount = discount;
        }

        public double calculateTotal() {
            return price - (price * discount);
        }
    }

    public static List<Order> orders() {
        return Arrays.asList(
                new Order(100.0, 0.10), // 10% discount
                new Order(200.0, 0.15), // 15% discount
                new Order(150.0, 0.05), // 5% discount
                new Order(120.0, 0.20)  // 20% discount
        );
    }
}
