package com.company.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {

    @FunctionalInterface
    interface PersonFactory<P extends Person> {
        P create(String firstName, String lastName);
    }

    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person::new;

        Person pers = personFactory.create("N", "SN");

        System.out.println(pers.getFirstName() + " " + pers.getLastName());

        List<String> someList = new ArrayList<String>();
        someList.add("123");
        someList.add("235");
        someList.add("555");
        someList.add("334");
        someList.add("1123");

        someList.stream().filter(f -> f.contains("3")).forEach(System.out::println);
    }
}
