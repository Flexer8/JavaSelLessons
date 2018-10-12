package com.company.generics;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        System.out.println("Работа с generics");

        System.out.println("Печать int:");

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(1);
        intList.add(2);
        intList.add(2);

        GenericArray<Integer> intArrayPrinter = new GenericArray<Integer>(intList);

        intArrayPrinter.printArray();
        System.out.println("Максимальное значение: " + intArrayPrinter.getMaxItem());

        System.out.println("Печать double:");

        List<Double> doubleList = new ArrayList<Double>();
        doubleList.add(0.0);
        doubleList.add(100.99);
        doubleList.add(-17.4);

        GenericArray<Double> doubleArrayPrinter = new GenericArray<Double>(doubleList);

        doubleArrayPrinter.printArray();
        System.out.println("Максимальное значение: " + doubleArrayPrinter.getMaxItem());

        System.out.println("Печать String:");

        List<String> stringList = new ArrayList<String>();
        stringList.add("First");
        stringList.add("Second");

        GenericArray<String> stringArrayPrinter = new GenericArray<String>(stringList);
        System.out.println("Максимальное значение: " + stringArrayPrinter.getMaxItem());

        stringArrayPrinter.printArray();
    }
}
