package za.ac.cput.factory;
/*
     BranchLocationFactory.java
     Entity for Branch Location Factory
     Author: George Charimba (220073465)
     24 March 2023

 */
import za.ac.cput.domain.BranchLocation;
import za.ac.cput.domain.Location;

import static za.ac.cput.util.Helper.generateId;
import static za.ac.cput.util.Helper.isNullOrEmpty;
public class BranchLocationFactory {

    public static BranchLocation createBranchLocation(String branchId, Location location ){
        if(isNullOrEmpty(branchId) || isNullOrEmpty(location)){
            return null;
        }

        return new BranchLocation.BranchLocationBuilder()
                .setBranchId(generateId())
                .setLocation(location)
                .build();
    }
}
