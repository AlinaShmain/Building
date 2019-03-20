package com.company;

public class Builder {
    private HouseBuilder houseBuilder;

    public Builder(int houseType) {

        if(houseType>1){
            houseBuilder = new RichHouseBuilder();
        } else {
            houseBuilder = new PoorHouseBuilder();
        }

//        switch (houseType) {
//            case "rich":
//                houseBuilder = new RichHouseBuilder();
//                System.out.println("rich");
//            case "poor":
//                System.out.println("poor");
//                houseBuilder = new PoorHouseBuilder();
//        }
    }

//    public House buildHouse(){
//        return houseBuilder.buildHouse();
//    }
}
