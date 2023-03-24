package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.SalesPersonContact;

import static org.junit.jupiter.api.Assertions.*;
import static za.ac.cput.util.Helper.generateId;

class SalesPersonContactFactoryTest {
    @Test
    public void testCreateSalesPersonContactSuccess(){
        SalesPersonContact salesPersonContact = SalesPersonContactFactory.createSalesPersonContact(generateId(), generateId());
        System.out.println(salesPersonContact);
        assertNotNull(salesPersonContact);
    }

}