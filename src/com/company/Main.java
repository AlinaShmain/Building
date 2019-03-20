package com.company;

public class Main {

    public static void main(String[] args) {

        HouseBuilder richBuilder = new RichHouseBuilder();
        HouseBuilder poorBuilder = new PoorHouseBuilder();

        Director director = new Director();

        System.out.println("building rich house");
        director.setCurrentBuilder(richBuilder);
        director.build(1);

        System.out.println("building poor house");
        director.setCurrentBuilder(poorBuilder);
        director.build(2);
    }
}
