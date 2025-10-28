package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Assets {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValues() {

        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;


        // looking for car age >= 3

        double value = 0.0;
        if(age <= 3) {
            for (int i = 0; i < age; i++) {
                value = 0.97 * getOriginalCost();
            }
            //         // looking for car age >= 5
        } else if ( age <= 5){
            for (int i = 0; i < age; i++){
                value = 0.94 * getOriginalCost();
            }
            // looking for age => 10
        } else if ( age <= 10) {
            for (int i = 0; i < age; i++) {
                value = 0.92 * getOriginalCost();
            }
        }else {
            value = getOriginalCost()-1000;

        }
        if (!(makeModel.contains("Honda") || makeModel.contains("Toyota")) && odometer> 10000){
            value *= 0.75;
        }
return value;
    }
}
