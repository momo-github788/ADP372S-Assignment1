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

    private String Address;


    private Branch(BranchBuilder builder) {
        this.branchId = builder.branchId;
        this.branchName = builder.branchName;
        this.yearOpened = builder.yearOpened;
        this.Address = builder.Address;
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

    public String getAddress() {
        return Address;
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
        private String Address;

        public Branch.BranchBuilder setBranchId(String BranchId) {
            this.branchId = branchId;
            return this;
        }

        public Branch.BranchBuilder setBranchName(String BranchName) {
            this.branchName = branchName;
            return this;
        }

        public Branch.BranchBuilder setYearOpened(int yearOpened) {
            this.yearOpened = yearOpened;
            return this;
        }

        public Branch.BranchBuilder setAddress(String Address) {
            this.Address = Address;
            return this;
        }

        public Branch.BranchBuilder copy(Branch Branch) {
            this.branchId = Branch.branchId;
            this.branchName = Branch.branchName;
            this.yearOpened = Branch.yearOpened;
            this.Address = Branch.Address;
            return this;
        }

        public Branch build() {
            return new Branch(this);
        }
    }
}

