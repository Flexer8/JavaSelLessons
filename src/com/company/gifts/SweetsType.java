package com.company.gifts;

public enum SweetsType {
    Candies("Конфеты"),
    Lollipops("Леденцы"),
    Wafers("Вафли");

    private String name;

    SweetsType(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
