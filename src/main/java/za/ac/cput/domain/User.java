/*  User.java
    Entity for the User
    Author: Alan Chapman (220092362)
    Date: 21 March 2023
*/
package za.ac.cput.domain;

import java.time.LocalDate;

public class User {
    private String userId;
    private String firstName;
    private String lastName;
    private LocalDate dateJoined;
    private int totalSales;
    private int totalPurchases;

    public User(){}

    public User(UserBuilder builder) {
        this.userId = builder.userId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.dateJoined = builder.dateJoined;
        this.totalSales = builder.totalSales;
        this.totalPurchases = builder.totalPurchases;
    }

    public String getUserId() {return userId;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public LocalDate getDateJoined() {return dateJoined;}
    public int getTotalSales() {return totalSales;}
    public int getTotalPurchases() {return totalPurchases;}

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateJoined=" + dateJoined +
                ", totalSales=" + totalSales +
                ", totalPurchases=" + totalPurchases +
                '}';
    }

    public static class UserBuilder {
        private String userId;
        private String firstName;
        private String lastName;
        private LocalDate dateJoined;
        private int totalSales;
        private int totalPurchases;

        public UserBuilder setUserId(String userId){
            this.userId = userId;
            return this;
        }
        public UserBuilder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public UserBuilder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public UserBuilder setDateJoined(LocalDate dateJoined){
            this.dateJoined = dateJoined;
            return this;
        }
        public UserBuilder setTotalSales(int totalSales){
            this.totalSales = totalSales;
            return this;
        }
        public UserBuilder setTotalPurchases(int totalPurchases){
            this.totalPurchases = totalPurchases;
            return this;
        }

        public UserBuilder copy(User user) {
            this.userId = userId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.dateJoined = dateJoined;
            this.totalSales = totalSales;
            this.totalPurchases = totalPurchases;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
