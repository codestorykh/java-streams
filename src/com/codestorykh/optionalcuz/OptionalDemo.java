package com.codestorykh.optionalcuz;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Optional<String> optionalValue = Optional.of("Hello");
        Optional<String> nullableValue = Optional.ofNullable(null);
        Optional<String> emptyValue = Optional.empty();

        System.out.println(optionalValue.orElse("Hi"));
        System.out.println(nullableValue.orElse("Free Text"));
        System.out.println(emptyValue.orElse("Empty Text"));

        System.out.println(optionalValue.isPresent());
        System.out.println(nullableValue.isPresent());
        System.out.println(emptyValue.isPresent());

        boolean isPresent = optionalValue.isPresent();
        optionalValue.ifPresent(System.out::println);
        boolean isEmpty = emptyValue.isEmpty();

        var value = optionalValue.get();
        var value2 = nullableValue.orElse("Default Value");
        var value3 = nullableValue.orElseGet(() -> "Default Value");
        //   var value4 = nullableValue.orElseThrow(() -> new IllegalArgumentException("Value is null"));
        //    var value5 = nullableValue.orElseThrow();

        System.out.println("Value: " + value);
        System.out.println("Value: " + value2);
        System.out.println("Value: " + value3);


        Optional<String> upperCaseValue = optionalValue.map(String::toUpperCase);
        var upperCaseValue2 = optionalValue.map(String::toUpperCase)
                .orElse("No value found");

        Optional<String> flatMappedValue = optionalValue
                .flatMap(nVar -> Optional.of(nVar.toUpperCase()));
        var flatMappedValue2 = optionalValue
                .flatMap(nVar -> Optional.of(nVar.toUpperCase()))
                .orElse("No value found");

    }
}
