package com.company;

public class Director {
    private HouseBuilder currentBuilder;

    public void setCurrentBuilder(HouseBuilder builder){
        this.currentBuilder = builder;
    }

    public void build(int houseType){
        if(houseType == 1) { // rich house
            currentBuilder.buildRoof();
            currentBuilder.buildFloor();
            currentBuilder.buildFloor();
            currentBuilder.buildBasement();
            currentBuilder.buildYard();
        } else { // poor house
            currentBuilder.buildRoof();
            currentBuilder.buildFloor();
            currentBuilder.buildBasement();
            currentBuilder.buildYard();
        }
    }
}
