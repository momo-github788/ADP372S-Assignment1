/*  UserContactFactory.java
    Class for User Contact Factory
    Author: Alan Chapman (220092362)
    Date: 24 March 2023
*/
package za.ac.cput.factory;

import za.ac.cput.domain.UserContact;
import za.ac.cput.util.Helper;

public class UserContactFactory {
    public static UserContact createUserContact(String userId, String contactId) {
        if (Helper.isNullOrEmpty(userId) || Helper.isNullOrEmpty(contactId))
            return null;

        return new UserContact.UserContactBuilder().setUserId(userId)
                .setContactId(contactId)
                .build();
    }
}
