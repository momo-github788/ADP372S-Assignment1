package za.ac.cput.domain;

/*
     BranchLocation.java
     Entity for Branch Location
     Author: George Charimba (220073465)
     22 March 2023

 */
public class BranchLocation {
   private String branchId;
   private Location location;

    public BranchLocation() {
    }

    public BranchLocation(BranchLocationBuilder builder) {
        this.branchId = builder.branchId;
        this.location = builder.location;
    }

    public String getBranchId() {
        return branchId;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "BranchLocation{" +
                "branchId='" + branchId + '\'' +
                ", location=" + location +
                '}';
    }

    public static class BranchLocationBuilder{
        private String branchId;
        private Location location;

        public BranchLocationBuilder setBranchId(String branchId) {
            this.branchId = branchId;
            return this;
        }

        public BranchLocationBuilder setLocation(Location location) {
            this.location = location;
            return this;
        }
        public BranchLocation build() {
            return new BranchLocation(this);
        }
    }
}
