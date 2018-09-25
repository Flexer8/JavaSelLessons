package com.company;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Калькулятор");

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        System.out.println(first + " + " + second + " = " + (first + second));

        scanner.close();
    }
}
