package ContactList;

public class Customer extends Contact {
    private int id;

    public Customer(String name, ContactData contactData, int id){
        super(name, contactData);
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("id: %d ",this.id);
    }

}
