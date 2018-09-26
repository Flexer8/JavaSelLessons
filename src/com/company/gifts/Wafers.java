package com.company.gifts;

/**
 * Вафли
 */
public class Wafers extends SweetsBase {

    private String filling; // начинка

    public Wafers(String name, double weight, double price, String filling) {
        super(SweetsType.Wafers, name, weight, price);

        this.filling = filling;
    }

    public String getFilling(){
        return filling;
    }
}
