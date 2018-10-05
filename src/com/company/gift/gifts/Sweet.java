package com.company.gift.gifts;

/**
 * Базовый класс для всех сладостей
 */
public abstract class Sweet {

    private String name;
    private double weight;
    private double price;
    private SweetsType sweetsType;

    public Sweet(SweetsType sweetsType, String name, double weight, double price){
        this.sweetsType = sweetsType;
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public SweetsType getType(){
        return sweetsType;
    }

    public String getSweetTypeName(){
        return sweetsType.getName();
    }

    /**
     * Вывести на консоль данные о сладости.
     * Базовые данные
     */
    protected void printAboutBasic() {
        System.out.println("Тип подарка: " + getSweetTypeName());
        System.out.println("Название: " + getName());
        System.out.println("Вес: " + getWeight());
        System.out.println("Цена: " + getPrice());
    }

    /**
     * Данные о конкретной сладости
     */
    public abstract  void printAbout();

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
