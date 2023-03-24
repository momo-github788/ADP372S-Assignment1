package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.SalesPerson;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import static za.ac.cput.util.Helper.generateId;

class SalesPersonFactoryTest {
    @Test
    public void testCreateSalesPersonSuccess() {

        SalesPerson salesPerson = SalesPersonFactory.createSalesPerson(generateId(), "Joe", "Goldberg", 4000, generateId());
        System.out.println(salesPerson.toString());
        assertNotNull(salesPerson);
    }

}