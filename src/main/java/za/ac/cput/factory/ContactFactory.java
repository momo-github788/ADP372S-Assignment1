package za.ac.cput.factory;

import za.ac.cput.domain.Contact;

import static za.ac.cput.util.Helper.generateId;
import static za.ac.cput.util.Helper.isNullOrEmpty;

/*  ContactFactory.java
    Factory for the Contact Entity
    Author:George Tapiwa Charimba (220073465)
    Date: 23 March 2023
*/
public class ContactFactory {
    public static Contact createContact(String mobileNumber){
        if(isNullOrEmpty(mobileNumber)){
            return null;
        }

        return new Contact.ContactBuilder()
                .setContactId(generateId())
                .setMobileNumber(mobileNumber)
                .build();
    }
}
