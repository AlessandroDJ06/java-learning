package ContactList;

public class Contacts {
    private Contact[] contacts;
    private final int CAPACITY = 100;
    private int amount;

    public Contacts(){
        this.contacts = new Contact[this.CAPACITY];
        this.amount = 0;

    }

    public int getAmount() {
        return amount;
    }

    public boolean addContact(Contact contact){
        if (amount < CAPACITY){
            contacts[amount] = contact;
            amount++;
            return true;
        } else {
            return false;
        }

    }

    public Contact getContact(int index){
        if (index > amount){
            return null;
        } else {
            return contacts[index];
        }

    }

    public boolean removeContact(int index){
        if (index < amount){
            for (int i = index; i < amount ; i++){
                if (i < 100){
                    contacts[i] = contacts[i+1];
                }else {
                    contacts[i] = null;
                }
            }
            amount--;
            return true;
        } else {
            return false;
        }
    }


}
