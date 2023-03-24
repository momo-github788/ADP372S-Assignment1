/*      VehicleFactoryTest.java
        Test for the Vehicle Factory
        Author: Simphiwe Kahlana (220162891)
        Date: 22 March 2023
        */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Branch;
import za.ac.cput.domain.Vehicle;

import static org.junit.jupiter.api.Assertions.*;

class VehicleFactoryTest {
    @Test
    public void testVehicleFactory(){
        Vehicle vehicle = VehicleFactory.createVehicle("BMW2891", "Convertible","M326s", "Sport", "Black",
                2023, 36000);
        System.out.println(vehicle.toString());
        assertNotNull(vehicle);
    }

}