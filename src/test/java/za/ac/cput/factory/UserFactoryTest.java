/*  UserFactoryTest.java
    Test class for User Factory
    Author: Alan Chapman (220092362)
    Date: 24 March 2023
*/
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.User;
import static za.ac.cput.util.Helper.generateId;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {
    @Test
    public void testCreateUser() {

        String userId = generateId();

        LocalDate date = LocalDate.of(2011, 05, 12);
        User user = UserFactory.createUser(userId, "Alan", "Chapman", date, 100, 150);
        System.out.println(user);
        assertNotNull(user);
    }
}