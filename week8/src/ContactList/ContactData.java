package ContactList;

public class ContactData {
    private final int MAX_PHONE_NUMBERS = 5;
    private String email;
    private PhoneNumber[] phoneNumbers;
    private int numberOfPhoneNumbers;

    public ContactData(String email){
        this.email = email;
        this.phoneNumbers = new PhoneNumber[MAX_PHONE_NUMBERS];
    }

    public String getEmail(){
        return this.email;
    }

    public void addPhoneNumber(PhoneNumber number){
        if (numberOfPhoneNumbers < MAX_PHONE_NUMBERS){
            this.phoneNumbers[numberOfPhoneNumbers] = number;
            numberOfPhoneNumbers++;
        }
    }

    public PhoneNumber[] getPhoneNumbers(){
        return this.phoneNumbers;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder(String.format("email: %s ",this.email));

        for (int i = 0 ; i < this.numberOfPhoneNumbers;i++){
            sb.append(this.phoneNumbers[i] + " ");
        }



        return sb.toString();
    }



}
