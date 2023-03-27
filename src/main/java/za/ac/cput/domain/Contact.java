package za.ac.cput.domain;
/*
     Contact.java
     Entity for Contact
     Author: George Charimba (220073465)
     22 March 2023
 */
public class Contact {
    private String contactId;
    private String mobileNumber;

    private Contact() {
    }

    private Contact(ContactBuilder builder) {
        this.contactId = builder.contactId;
        this.mobileNumber = builder.mobileNumber;
    }

    public String getContactId() {
        return contactId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId='" + contactId + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }

    public static class ContactBuilder{
        private String contactId;
        private String mobileNumber;

        public ContactBuilder setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }

        public ContactBuilder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public Contact.ContactBuilder copy(Contact Contact){
            this.contactId = Contact.contactId;
            this.mobileNumber = Contact.mobileNumber;
            return this;
        }
        public Contact build() {
            return new Contact(this);
        }
    }
} // end of public class Contact
