/*
     SalesPersonFactoryTest.java
     Entity for Sales Person
     Author: Junaid Cedrass (219090912)
     20 March 2023

 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.SalesPerson;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import static za.ac.cput.util.Helper.generateId;

class SalesPersonFactoryTest {
    @Test
    public void testCreateSalesPersonSuccess() {

        SalesPerson salesPerson = SalesPersonFactory.createSalesPerson( "Joe", "Goldberg", 4000);
        System.out.println(salesPerson.toString());
        assertNotNull(salesPerson);
    }

}