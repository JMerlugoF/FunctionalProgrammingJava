package main.java.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Integer number = null;
        int couter = 0;

        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            int counter = 0;
            // logica
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Alex", null));



    }



}
