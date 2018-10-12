package com.company.gift;


import com.company.gift.giftbag.GiftBag;
import com.company.gift.gifts.Candy;
import com.company.gift.gifts.Lollipop;
import com.company.gift.gifts.SweetsType;
import com.company.gift.gifts.Wafers;

public class Main {

    public static void main(String[] args) {
        GiftBag giftBag = new GiftBag();

        giftBag.addSweet(new Candy("Коровка", 0.4, 1.0, false));
        giftBag.addSweet(new Lollipop("Чупа-Чупс", 0.2, 1.5, true));
        giftBag.addSweet(new Lollipop("Взлетные", 0.3, 0.6, false));
        giftBag.addSweet(new Wafers("Лимонные", 1.3, 1.9, "Лимон"));
        giftBag.addSweet(new Wafers("Шоколадные", 1.0, 2.0, "Шоколад"));

        giftBag.printGiftData();

        giftBag.delSweetByType(SweetsType.Wafers);

        giftBag.printGiftData();
    }
}
