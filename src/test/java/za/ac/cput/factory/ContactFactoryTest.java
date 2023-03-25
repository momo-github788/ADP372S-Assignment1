package za.ac.cput.factory;
/*
     ContactFactoryTest.java
     Entity for Contact Factory Test
     Author: George Charimba (220073465)
     24 March 2023

 */
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.SalesPerson;

import static org.junit.jupiter.api.Assertions.*;

class ContactFactoryTest {
    @Test
    public void testCreateContactSuccess(){
        Contact contact = ContactFactory.createContact("12", "0629390280");
        System.out.println(contact.toString());
        assertNotNull(contact);
    }
}