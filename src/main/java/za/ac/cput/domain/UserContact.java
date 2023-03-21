/*  UserContact.java
    Entity for the User Contact
    Author: Alan Chapman (220092362)
    Date: 21 March 2023
*/
package za.ac.cput.domain;

public class UserContact extends User {
    private String contactId;

    public UserContact(){}

    public UserContact(UserContactBuilder builder) {
        this.contactId = builder.contactId;
    }

    public String getContactId() {return contactId;}

    @Override
    public String toString() {
        return "UserContact{" +
                "contactId='" + contactId + '\'' +
                '}';
    }

    public static class UserContactBuilder {
        private String contactId;

        public UserContactBuilder setUserId(String contactId){
            this.contactId = contactId;
            return this;
        }

        public UserContactBuilder copy(UserContact contact) {
            this.contactId = contactId;
            return this;
        }

        public UserContact build(){
            return new UserContact(this);
        }
    }
}
