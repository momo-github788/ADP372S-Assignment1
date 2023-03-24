package za.ac.cput.factory;

/*  PostFactoryTest.java
    Test class for PostFactory
    Author: Muhammed Luqmaan Hoosain (220464901)
    Date: 22 March 2023
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Branch;
import za.ac.cput.domain.Post;
import za.ac.cput.domain.Vehicle;

import static org.junit.jupiter.api.Assertions.*;
import static za.ac.cput.util.Helper.generateId;

class PostFactoryTest {

    @Test
    void testCreatePostSuccess() {

        Vehicle vehicle = new Vehicle.Builder().setVehicleId(generateId()).setMake("Audi").setModel("A4").setType("Sedan").setColour("Red")
                .setYear(2015).setMileage(24000).build();

        Branch branch = new Branch.BranchBuilder().setBranchId(generateId()).setBranchName("Cape Town").setYearOpened(2017).build();

        Post post = PostFactory.createPost("Audi A4 For sale", "Car is in good condition. License up to date", 249999.99, vehicle, branch,
                true);

        System.out.println(post);
        assertNotNull(post);
    }

    @Test
    void testCreatePostWithNullValue() {

        Post post = PostFactory.createPost("Audi A4 For sale", "Car is in good condition. License up to date", 249999.99, null, null,
                true);

        System.out.println(post);
        assertNull(post);
    }


}