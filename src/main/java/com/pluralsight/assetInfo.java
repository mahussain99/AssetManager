package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class assetInfo {
    public static void main(String[] args) {

        List<Assets> assets = new ArrayList<>();
        // Creating a house asset here

        House houseInfo1 = new House(" House name", " 09-09-2009", 560000,
                "123 main st", 30000, 5000, 5000 );

        House houseInfo2 = new House(" House name", " 09-09-2009", 560000,
                "123 main st", 30000, 5000, 5000 );

        // Creating a Vehicle object

        Vehicle vehicleInfo1 = new Vehicle(" Car", "09-09-2010", 30000);
        Vehicle vehicleInfo2 = new Vehicle(" SUV", "09-09-2011", 40000);

// adding asset depend on the demand
        assets.add(houseInfo1);
        assets.add(houseInfo2);
        assets.add(vehicleInfo1);
        assets.add(vehicleInfo2);




    }
}
