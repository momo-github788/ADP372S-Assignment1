/*  UserFactory.java
    Factory class for user
    Author: Alan Chapman (220092362)
    Date: 24 March 2023
*/
package za.ac.cput.factory;

import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

public class UserFactory {
    public static User createUser(String userId, String firstName, String lastName, LocalDate dateJoined, int totalSales, int totalPurchases) {

        if(Helper.isNullOrEmpty(userId) || Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName) || Helper.isNullOrEmpty(dateJoined))
            return null;

        if (Helper.isNullOrEmpty(totalSales) || Helper.isNullOrEmpty(totalPurchases))
            return null;

        return new User.UserBuilder().setUserId(userId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setDateJoined(dateJoined)
                .setTotalSales(totalSales)
                .setTotalPurchases(totalPurchases)
                .build();
    }
}
