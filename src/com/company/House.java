package com.company;

public class House {

    private int floors;
    private boolean window;

    public House(){
        floors = 0;
        window = false;
    }
    public void setFloors(int newLevel){
        floors = newLevel;
    }
    public int getFloors(){
        return floors;
    }

    public void buildBasement(){
        System.out.println("--------\n|$$$$$$|\n--------");
    }

    public void setWindow(){
        this.window = true;
    }

    public void buildFloor(){
        System.out.println("--------");
        if(this.window){
            System.out.println("|   O   |");
            this.window = false;
        } else {
            System.out.println("|       |");
        }
    }
    public void buildRoof(){
        System.out.println("   $$\n  /  \\   \n /    \\");
    }
}
