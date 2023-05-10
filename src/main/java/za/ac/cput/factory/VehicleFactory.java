/*      VehicleFactory.java
        Factory for the Vehicle Entity
        Author: Simphiwe Kahlana (220162891)
        Date: 22 March 2023
        */

package za.ac.cput.factory;

import za.ac.cput.domain.Branch;
import za.ac.cput.domain.Vehicle;
import za.ac.cput.util.Helper;

public class VehicleFactory {
    public static Vehicle createVehicle(String VehicleId, String Make, String Model, String Type, String Colour, int Year, int Mileage){

        if (Helper.isNullOrEmpty(VehicleId) || Helper.isNullOrEmpty(Make) || Helper.isNullOrEmpty(Model) || Helper.isNullOrEmpty(Type)
                || Helper.isNullOrEmpty(Colour)|| Helper.isNullOrEmpty(Year)|| Helper.isNullOrEmpty(Mileage))
            return null;
        //PLEASE LET ME KNOW IF THERE'S SOMETHING MISSING

        return new Vehicle.Builder().setVehicleId(VehicleId)
                .setMake(Make)
                .setModel(Model)
                .setType(Type)
                .setColour(Colour)
                .setYear(Year)
                .setMileage(Mileage)
                .build();
    }
}
