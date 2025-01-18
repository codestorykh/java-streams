package com.codestorykh;

import java.util.List;

public class Filtering {

   public static void main(String[] args) {

       List<String> filteredName = names();
       System.out.println("Print as list: " + filteredName);
       filteredName.forEach(System.out::println);
    }

    public static List<String> names(){
        return MockData.namesInKhmer().stream()
                .distinct()
                .filter(n -> n.length() > 3)
                .toList();
    }


}
