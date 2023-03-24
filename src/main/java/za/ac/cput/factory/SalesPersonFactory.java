package za.ac.cput.factory;

import za.ac.cput.domain.SalesPerson;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static za.ac.cput.util.Helper.isNullOrEmpty;

public class SalesPersonFactory {

    //creating Sales Person objects
    public static SalesPerson createSalesPerson(String salesPersonId, String firstName, String lastName, int totalSales, String ratingId){
        if(isNullOrEmpty(salesPersonId) || isNullOrEmpty(firstName) || isNullOrEmpty(lastName) ||  isNullOrEmpty(totalSales) || isNullOrEmpty(ratingId)){
            return null;
        }

        return new SalesPerson.SalesPersonBuilder()
                .setSalesPersonId(salesPersonId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setDateJoined(LocalDate.now())
                .setTotalSales(totalSales)
                .setRatingId(ratingId)
                .build();
    }
}
