package com.company.gift.gifts;

/**
 * Базовый класс для всех сладостей
 */
public class SweetsBase {

    private String name;
    private double weight;
    private double price;
    private SweetsType sweetsType;

    public SweetsBase(SweetsType sweetsType, String name, double weight, double price){
        this.sweetsType = sweetsType;
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getType(){
        return sweetsType.getName();
    }

    public String getName(){
        return name;
    }

    public double getWeight(){
        return weight;
    }

    public double getPrice(){
        return price;
    }
}
