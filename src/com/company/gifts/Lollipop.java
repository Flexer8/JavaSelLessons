package com.company.gifts;

/**
 * Леденцы
 */
public class Lollipop extends SweetsBase {

    private boolean onStick; // на палочке?

    public Lollipop(String name, double weight, double price, boolean onStick){
        super(SweetsType.Lollipops, name, weight, price);

        this.onStick = onStick;
    }

    public boolean isOnStick(){
        return onStick;
    }
}
