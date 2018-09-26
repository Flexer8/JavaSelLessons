package com.company.gifts;

/**
 * Леденцы
 */
public class Lollipop extends Sweet {

    private boolean onStick; // на палочке?

    public Lollipop(String name, double weight, double price, boolean onStick){
        super(SweetsType.Lollipops, name, weight, price);

        this.onStick = onStick;
    }

    @Override
    public void printAbout() {
        printAboutBasic();

        if (isOnStick()){
            System.out.println("На палочке");
        } else {
            System.out.println("Не на палочке");
        }
    }

    public boolean isOnStick(){
        return onStick;
    }
}
