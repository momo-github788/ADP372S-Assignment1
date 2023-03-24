/*      BranchFactory.java
        Factory for the Branch Entity
        Author: Simphiwe Kahlana (220162891)
        Date: 22 March 2023
        */
package za.ac.cput.factory;

import za.ac.cput.domain.Branch;
import za.ac.cput.util.Helper;

public class BranchFactory {

    public static Branch createBranch(String branchId, String branchName, int yearOpened){

        if(Helper.isNullOrEmpty(branchId) || Helper.isNullOrEmpty(branchName) || Helper.isNullOrEmpty(yearOpened))
            return null;

        //PLEASE LET ME KNOW IF THERE'S ANYTHING MISSING
        return new Branch.BranchBuilder().setBranchId(branchId)
                .setBranchName(branchName)
                .setYearOpened(yearOpened)
                .build();

    }
}
