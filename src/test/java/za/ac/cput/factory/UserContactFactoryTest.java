/*  UserContactFactoryTest.java
    Test class for User Contact Factory
    Author: Alan Chapman (220092362)
    Date: 24 March 2023
*/
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.UserContact;
import static za.ac.cput.util.Helper.generateId;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserContactFactoryTest {
    @Test
    public void testCreateUserContact() {
        String userId = generateId();
        String contactId = generateId();

        UserContact userC = UserContactFactory.createUserContact(userId, contactId);
        System.out.println(userC);
        assertNotNull(userC);
    }
}