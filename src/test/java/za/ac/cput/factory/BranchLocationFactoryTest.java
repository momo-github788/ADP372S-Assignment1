package za.ac.cput.factory;
/*
     BranchLocationFactoryTest.java
     Entity for Branch Location Factory Test
     Author: George Charimba (220073465)
     24 March 2023

 */

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.BranchLocation;

import static org.junit.jupiter.api.Assertions.*;

class BranchLocationFactoryTest {

    @Test
    public void testCreateBranchLocationSuccess(){
        BranchLocation branchLocation = BranchLocationFactory.createBranchLocation(null);
        System.out.println(branchLocation.toString());
        assertNotNull(branchLocation);
    }
}