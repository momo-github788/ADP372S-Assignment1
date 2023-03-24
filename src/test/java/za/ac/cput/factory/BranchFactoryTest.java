/*      BranchFactoryTest.java
        Test for the Branch Factory
        Author: Simphiwe Kahlana (220162891)
        Date: 22 March 2023
        */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Branch;

import static org.junit.jupiter.api.Assertions.*;

class BranchFactoryTest {

    @Test

    public void testBranchFactory(){
        Branch branch = BranchFactory.createBranch("Sim2891", "Paarl Auto",2008);
        System.out.println(branch.toString());
        assertNotNull(branch);

        //Is Something missing?
    }


}