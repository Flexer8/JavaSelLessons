package com.company.gifts;

/**
 * Конфеты
 */
public class Candy extends Sweet {

    private boolean withCocolate; // шоколадная или нет

    public Candy(String name, double weight, double price, boolean whisCocolate){
        super(SweetsType.Candies, name, weight, price);

        this.withCocolate = whisCocolate;
    }

    public boolean isWithCocolate() {
        return withCocolate;
    }

    @Override
    public void printAbout() {
        printAboutBasic();

        if (isWithCocolate()){
            System.out.println("С шоколадом");
        } else {
            System.out.println("Без шоколада");
        }
    }
}
