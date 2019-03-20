package com.company;

public class RichHouseBuilder implements HouseBuilder {

    @Override
    public void buildRoof() {
        System.out.println( "                                  ~~~                  \n" +
                            "                      x   $   x | |                    \n" +
                            "                 x              | |   x                \n" +
                            "             x                    |     x              \n" +
                            "           (_____________________________)               ");
    }

    @Override
    public void buildFloor() {
        System.out.println( "           |     |+|             |+|     |             \n" +
                            "           |_____________________________|               ");
    }

    @Override
    public void buildBasement() {
        System.out.println( "           |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|             \n" +
                            "           |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|               ");
    }

    @Override
    public void buildYard() {
        System.out.println( "                                                   |##|\n" +
                            "///////////////////////////////////////////////////|##|//\n");
    }
}
