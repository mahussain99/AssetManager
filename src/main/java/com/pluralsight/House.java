package com.pluralsight;

public class House extends Assets {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;


    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {

        double priceSquareFeet = 0;

        switch (condition) {
            case 1:
                priceSquareFeet = 180;
                System.out.println("Excellent");
                break;
            case 2:
                priceSquareFeet = 130;
                System.out.println("Good");
                break;
            case 3:
                priceSquareFeet = 90;
                System.out.println("Fair");
                break;
            case 4:
                priceSquareFeet = 80;
                System.out.println("Poor");

                break;
            default:
                System.out.println("Condition has a wrong value");
        }
        return (squareFoot * priceSquareFeet) + (lotSize * 0.25);


    }

    @Override
    public double getValues() {
        return 0;
    }
}



