package com.company.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class Streems {

    public static void main(String[] args) {
        List<Person> pList = new ArrayList<Person>();

        pList.add(new Person("A", "B", 10));
        pList.add(new Person("A", "B", 20));
        pList.add(new Person("C", "D", 15));

        List<Person> comPList = new ArrayList<Person>();

        pList.stream().forEach(person -> {
            if (!comPList.stream().anyMatch(f -> f.getFirstName().equals(person.getFirstName()))){
                comPList.add(new Person(person.getFirstName(), "None", 0));
            }

            comPList.stream().filter(f -> f.getFirstName()
                    .equals(person.getFirstName()))
                    .forEach(s -> {s.setAge(s.getAge() + person.getAge());});
        });

        comPList.stream().forEach(c -> {
            System.out.println(c.getFirstName() + ": " + c.getAge());
        });


        // Другая реализация того же самого
        System.out.println("\nВариант с HashMap:");
        Map<String, List<Person>> map = pList.stream().collect(Collectors.groupingBy(p -> p.getFirstName()));

        map.entrySet().stream().forEach(item -> {
            System.out.println(item.getKey() + ": " + item.getValue().stream().mapToInt(Person::getAge).sum());
        });
    }
}
