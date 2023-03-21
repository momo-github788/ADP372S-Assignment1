/*  UserContact.java
    Entity for the User Contact
    Author: Alan Chapman (220092362)
    Date: 21 March 2023
*/
package za.ac.cput.domain;

public class UserContact {
    private String userId;
    private String contactId;

    private UserContact(){}

    private UserContact(UserContactBuilder builder) {
        this.userId =builder.userId;
        this.contactId = builder.contactId;
    }

    public String getUserId() {return userId;}
    public String getContactId() {return contactId;}

    @Override
    public String toString() {
        return "UserContact{" +
                "userId='" + userId + '\'' +
                ", contactId='" + contactId + '\'' +
                '}';
    }

    public static class UserContactBuilder {
        private String userId;
        private String contactId;

        public UserContactBuilder setUserId(String userId){
            this.userId = userId;
            return this;
        }
        public UserContactBuilder setContactId(String contactId){
            this.contactId = contactId;
            return this;
        }

        public UserContactBuilder copy(UserContact contact) {
            this.userId =userId;
            this.contactId = contactId;
            return this;
        }

        public UserContact build(){
            return new UserContact(this);
        }
    }
}
