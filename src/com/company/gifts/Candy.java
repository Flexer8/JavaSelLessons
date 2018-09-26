package com.company.gifts;

/**
 * Конфеты
 */
public class Candy extends SweetsBase {

    private boolean whisCocolate; // шоколадная или нет

    public Candy(String name, double weight, double price, boolean whisCocolate){
        super(SweetsType.Candies, name, weight, price);

        this.whisCocolate = whisCocolate;
    }

    public boolean isWhisCocolate() {
        return whisCocolate;
    }
}
