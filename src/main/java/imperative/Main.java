package main.java.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    //imperative approach
//    public static void main(String[] args) {
//        List<main.java.imperative.Person> people = List.of(
//                new main.java.imperative.Person("Luis", main.java.imperative.Gender.MALE),
//                new main.java.imperative.Person("Liza", main.java.imperative.Gender.FEMALE),
//                new main.java.imperative.Person("Geraldo", main.java.imperative.Gender.MALE),
//                new main.java.imperative.Person("Eliza", main.java.imperative.Gender.FEMALE),
//                new main.java.imperative.Person("Pedro", main.java.imperative.Gender.MALE)
//        );
//
//        List<main.java.imperative.Person> females = new ArrayList<>();
//
//        for ( main.java.imperative.Person person : people) {
//            if(person.getGender().equals(main.java.imperative.Gender.FEMALE))
//                females.add(person);
//        }
//
//        for ( main.java.imperative.Person female : females) {
//            System.out.println(female.toString());
//        }
//    }

    //declarative approach
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Luis", Gender.MALE),
                new Person("Liza", Gender.FEMALE),
                new Person("Geraldo", Gender.MALE),
                new Person("Eliza", Gender.FEMALE),
                new Person("Pedro", Gender.MALE)
        );

        Predicate<Person> isFemale = person -> person.getGender().equals(Gender.FEMALE);

        List females = people.stream()
                .filter(isFemale)
                .collect(Collectors.toList());
        females.forEach(System.out::println);

        people.stream()
                .map(person -> person.getGender())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.getName())
                .mapToInt(String::length)
                .forEach(System.out::println);

        Boolean containsOnlyFemales = people.stream()
                .allMatch(person -> isFemale.test(person));

        System.out.println(containsOnlyFemales);

        Optional.ofNullable("joao@gmail.com").ifPresentOrElse(email -> System.out.println("Um email foi enviado para " + email), () -> {
            System.out.println("O email é vazio");
        });

    }
}