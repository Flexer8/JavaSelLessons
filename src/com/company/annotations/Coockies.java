package com.company.annotations;

@ControlledObject(name = "Some")
public class Coockies {

    public void setColor(String color) {
        this.color = color;
    }

    @ControlledObject(name = "Color")
    public String color;

    @StartObject
    public void createCoockie(){

    }

    @StopObject
    public void stopCoockie(){

    }
}
