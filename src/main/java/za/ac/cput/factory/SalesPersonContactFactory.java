/*
     SalesPerson.java
     Entity for Sales Person Contact Factory
     Author: Junaid Cedrass (219090912)
     24 March 2023

 */
package za.ac.cput.factory;

import za.ac.cput.domain.SalesPersonContact;

import static za.ac.cput.util.Helper.generateId;
import static za.ac.cput.util.Helper.isNullOrEmpty;

public class SalesPersonContactFactory {

    //Creating Sales Person Contact details objects
    public static SalesPersonContact createSalesPersonContact() {

        return new SalesPersonContact.SalesPersonContactBuilder()
                .setSalesPersonId(generateId())
                .setContactId(generateId())
                .build();
    }
}