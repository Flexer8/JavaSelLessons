package com.company.gift.gifts;

/**
 * Вафли
 */
public class Wafers extends Sweet {

    private String filling; // начинка

    public Wafers(String name, double weight, double price, String filling) {
        super(SweetsType.Wafers, name, weight, price);

        this.filling = filling;
    }

    @Override
    public void printAbout() {
        printAboutBasic();

        System.out.println("Начинка: " + filling);
    }

    public String getFilling(){
        return filling;
    }
}
