package za.ac.cput.domain;
/*
     SalesPersonContact.java
     Entity for Sales Person
     Author: Junaid Cedrass (219090912)
     20 March 2023

 */
public class SalesPersonContact {
    private String salesPersonId;
    private String contactId;

    private SalesPersonContact(){
    }

    private SalesPersonContact(SalesPersonContactBuilder builder){
        this.salesPersonId = builder.salesPersonId;
        this.contactId = builder.contactId;
    }
    public String getSalesPersonId() {
        return salesPersonId;
    }

    public String getContactId() {
        return contactId;
    }


    @Override
    public String toString() {
        return "SalesPersonContact{" +
                "salesPersonId='" + salesPersonId + '\'' +
                ", contactId='" + contactId + '\'' +
                '}';
    }

    public static class SalesPersonContactBuilder{
        private String salesPersonId;
        private String contactId;

        public SalesPersonContactBuilder setSalesPersonId(String salesPersonId) {
            this.salesPersonId = salesPersonId;
            return this;
        }
        public SalesPersonContactBuilder setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }

        public SalesPersonContactBuilder copy(SalesPersonContact salesPersonContact){
            this.salesPersonId = salesPersonContact.salesPersonId;
            this.contactId = salesPersonContact.contactId;
            return this;
        }

        public SalesPersonContact build(){return new SalesPersonContact(this);}
    }
}
