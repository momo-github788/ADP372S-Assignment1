package za.ac.cput.domain;

public class Contact {
    private String contactId;
    private String mobileNumber;

    public Contact() {
    }

    public Contact(ContactBuilder builder) {
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

        public void setContactId(String contactId) {
            this.contactId = contactId;
        }

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }
        public Contact build() {
            return new Contact(this);
        }
    }
} // end of public class Contact
