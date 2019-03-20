package com.company;

public class PoorHouseBuilder extends HouseBuilder {

    @Override
    public void buildRoof() {
        System.out.println("              ________________________               \n" +
                           "             /                         \\            \n" +
                           "            /                           \\           \n" +
                           "           /_____________________________\\            ");
    }

    @Override
    public void buildFloor() {
        System.out.println( "           |                             |             \n" +
                            "           |_____________________________|               ");
    }

    @Override
    public void buildBasement() {
        System.out.println( "           |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|              \n");
    }

    @Override
    public void buildYard() {
        System.out.println( "//////////////////////////////////////////////////////////");
    }
}
