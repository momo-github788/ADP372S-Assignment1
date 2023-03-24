/*  Branch.java
    This is my Domain Vehicle entity
    Author: Simphiwe Kahlana (220162891)
    Date: 21 March 2023
*/
package za.ac.cput.domain;

public class Vehicle {
    private String vehicleId;
    private String make;
    private String model;
    private String type;
    private String colour;
    private int year;
    private int mileage;

    private Vehicle(){}

    private Vehicle (Builder builder){
        this.vehicleId = builder.vehicleId;
        this.make = builder.make;
        this.model = builder.model;
        this.type = builder.type;
        this.colour = builder.colour;
        this.year = builder.year;
        this.mileage = builder.mileage;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getMake() {
        return make;
    }


    public String getModel() {
        return model;
    }


    public String getType() {
        return type;
    }


    public String getColour() {
        return colour;
    }


    public int getYear() {
        return year;
    }


    public int getMileage() {
        return mileage;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }

    public static class Builder{
        private String vehicleId;
        private String make;
        private String model;
        private String type;
        private String colour;
        private int year;
        private int mileage;

        public Builder setVehicleId(String vehicleId) {
            this.vehicleId = vehicleId;
            return this;
        }

        public Builder setMake(String make) {
            this.make = make;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setMileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public Builder copy(Vehicle vehicle){
            this.vehicleId = vehicle.vehicleId;
            this.make = vehicle.make;
            this.model = vehicle.model;
            this.type = vehicle.type;
            this.colour = vehicle.colour;
            this.year = vehicle.year;
            this.mileage = vehicle.mileage;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }
}
