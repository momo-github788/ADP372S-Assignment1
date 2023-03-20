package za.ac.cput.domain;
/*
     SalesPerson.java
     Entity for Sales Person
     Author: Junaid Cedrass (219090912)
     20 March 2023

 */
import java.time.LocalDate;

public class SalesPerson {
    private String salesPersonId;
    private String firstName;
    private String lastName;
    private LocalDate dateJoined;
    private int totalSales;
    private String ratingId;

    private SalesPerson(){
    }

    private SalesPerson(SalesPersonBuilder builder){
        this.salesPersonId = builder.salesPersonId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.dateJoined = builder.dateJoined;
        this.totalSales = builder.totalSales;
        this.ratingId = builder.ratingId;
    }
    public String getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(String salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(LocalDate dateJoined) {
        this.dateJoined = dateJoined;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    public String getRatingId() {
        return ratingId;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "salesPersonId='" + salesPersonId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateJoined=" + dateJoined +
                ", totalSales=" + totalSales +
                ", ratingId='" + ratingId + '\'' +
                '}';
    }

    public static class SalesPersonBuilder {
        private String salesPersonId;
        private String firstName;
        private String lastName;
        private LocalDate dateJoined;
        private int totalSales;
        private String ratingId;

        public SalesPersonBuilder setSalesPersonId(String salesPersonId) {
            this.salesPersonId = salesPersonId;
            return this;
        }

        public SalesPersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public SalesPersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public SalesPersonBuilder setDateJoined(LocalDate dateJoined) {
            this.dateJoined = dateJoined;
            return this;
        }

        public SalesPersonBuilder setTotalSales(int totalSales) {
            this.totalSales = totalSales;
            return this;
        }

        public SalesPersonBuilder setRatingId(String ratingId) {
            this.ratingId = ratingId;
            return this;
        }

        public SalesPersonBuilder copy(SalesPerson SalesPerson){
            this.salesPersonId = SalesPerson.salesPersonId;
            this.firstName = SalesPerson.firstName;
            this.lastName = SalesPerson.lastName;
            this.dateJoined = SalesPerson.dateJoined;
            this.totalSales = SalesPerson.totalSales;
            this.ratingId = SalesPerson.ratingId;
            return this;
        }

        public SalesPerson build() {
            return new SalesPerson(this);
        }
    }
}
