
/*
     SalesPersonFactory.java
     Entity for Sales Person Factory
     Author: Junaid Cedrass (219090912)
     24 March 2023

 */
package za.ac.cput.factory;
import za.ac.cput.domain.SalesPerson;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static za.ac.cput.util.Helper.generateId;
import static za.ac.cput.util.Helper.isNullOrEmpty;

public class SalesPersonFactory {

    //creating Sales Person objects
    public static SalesPerson createSalesPerson( String firstName, String lastName, int totalSales){
        if( isNullOrEmpty(firstName) || isNullOrEmpty(lastName) ||  isNullOrEmpty(totalSales)){
            return null;
        }

        return new SalesPerson.SalesPersonBuilder()
                .setSalesPersonId(generateId())
                .setFirstName(firstName)
                .setLastName(lastName)
                .setDateJoined(LocalDate.now())
                .setTotalSales(totalSales)
                .setRatingId(generateId())
                .build();
    }
}
