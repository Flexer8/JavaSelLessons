package com.company.giftbag;


import com.company.gifts.Sweet;
import com.company.gifts.SweetsType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Мешок с подарками
 */
public class GiftBag {

    private List<Sweet> giftList;

    public GiftBag(){
        giftList = new ArrayList<Sweet>();
    }

    /**
     * Добавить сладость в общий подарок
     *
     * @param sweet
     */
    public void addSweet(Sweet sweet){
        giftList.add(sweet);
    }

    /**
     * Удаление из подарка всех сладостей определенного типа
     *
     * @param sweetsType
     */
    public void delSweetByType(SweetsType sweetsType){
        Iterator<Sweet> sweetIterator = giftList.iterator();

        while (sweetIterator.hasNext()){
            Sweet sweet = sweetIterator.next();

            if (sweet.getType() == sweetsType){
                sweetIterator.remove();
            }
        }
    }

    /**
     * Получение общей стоимости подарков
     *
     * @return
     */
    private double getTotalPrice(){
        double totalPrice = 0.0;

        for (Sweet sweet : giftList){
            totalPrice += sweet.getPrice();
        }

        return totalPrice;
    }

    /**
     * Получение общего веса подарков
     * @return
     */
    private double getTotalWeight(){
        double totalWeight = 0.0;

        for (Sweet sweet : giftList){
            totalWeight += sweet.getWeight();
        }

        return totalWeight;
    }

    /**
     * Печать на экране данных о подарке
     */
    public void printGiftData(){
        System.out.println("Новогодний подарок:\n");


        for (Sweet sweet : giftList){
            sweet.printAbout();
            System.out.println("\n");
        }

        System.out.println("Всего сладостей: " + giftList.size());
        System.out.println("Общая стоимость: " + getTotalPrice());
        System.out.println("Общий вес: " + getTotalWeight());
        System.out.println("\n");
    }
}
