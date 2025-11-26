package ContactList;

public class Contact {
    private String name;
    private ContactData contactData;

    public Contact(String name, ContactData contactData){
        this.name = name;
        this.contactData = contactData;
    }

    public String getName(){
        return this.name;
    }

    public ContactData getContactData(){
        return this.contactData;
    }

    public String toString() {
        return String.format("name: %s, %s",this.name,this.contactData);
    }
}
