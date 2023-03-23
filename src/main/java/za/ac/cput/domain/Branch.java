/*  Branch.java
    This is my Domain Branch with entities
    Author: Simphiwe Kahlana (220162891)
    Date: 21 March 2023
*/

package za.ac.cput.domain;


public class Branch {

    private String branchId;
    private String branchName;
    private int yearOpened;


    private Branch(BranchBuilder builder) {
        this.branchId = builder.branchId;
        this.branchName = builder.branchName;
        this.yearOpened = builder.yearOpened;
    }

    public String getBranchId() {
        return branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public int getYearOpened() {
        return yearOpened;
    }


    @Override
    public String toString() {
        return "Branch{" +
                "branchId='" + branchId + '\'' +
                ", branchName='" + branchName + '\'' +
                ", yearOpened=" + yearOpened +
                '}';
    }

    public static class BranchBuilder {
        private String branchId;
        private String branchName;
        private int yearOpened;


        public BranchBuilder setBranchId(String branchId) {
            this.branchId = branchId;
            return this;
        }

        public BranchBuilder setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }

        public BranchBuilder setYearOpened(int yearOpened) {
            this.yearOpened = yearOpened;
            return this;
        }


        public BranchBuilder copy(Branch Branch) {
            this.branchId = Branch.branchId;
            this.branchName = Branch.branchName;
            this.yearOpened = Branch.yearOpened;
            return this;
        }

        public Branch build() {
            return new Branch(this);
        }
    }
}

