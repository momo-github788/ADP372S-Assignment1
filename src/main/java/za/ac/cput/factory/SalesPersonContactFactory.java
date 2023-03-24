package za.ac.cput.factory;

import za.ac.cput.domain.SalesPersonContact;

import static za.ac.cput.util.Helper.isNullOrEmpty;

public class SalesPersonContactFactory {

    //Creating Sales Person Contact details objects
    public static SalesPersonContact createSalesPersonContact(String salesPersonId, String contactId) {
        if (isNullOrEmpty(salesPersonId) || isNullOrEmpty(contactId)) {
            return null;
        }

        return new SalesPersonContact.SalesPersonContactBuilder()
                .setSalesPersonId(salesPersonId)
                .setContactId(contactId)
                .build();
    }
}