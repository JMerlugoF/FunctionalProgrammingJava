package main.java.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        //functions takes one argument and one output
        Function<Integer, Integer> increment = number -> number + 1;
        Function<Integer, Integer> multiplyBy10 = number -> number * 10;
        Function<Integer, Integer> incrementAndMultiplyBy10 = increment.andThen(multiplyBy10);

        int number;

        number = increment.apply(1);
        System.out.println(number);

        number = incrementAndMultiplyBy10.apply(2);
        System.out.println(number);


        //function takes two arguments and one output
        BiFunction<Integer,Integer,Integer> incrementAndMultiplyBiFunction = (nIncrement,nMultiply) -> (nIncrement +1) * nMultiply;

        number = incrementAndMultiplyBiFunction.apply(2,10);
        System.out.println(number);
    }
}
