package ContactList;

public class TestContacts {
    public static void main(String[] args) {
        ContactData contactData = new ContactData("bianca.pieters@thuis.com");
        contactData.addPhoneNumber(new PhoneNumber(Kind.MOBILE, "0478/65.25.86"));
        Customer bianca = new Customer("Bianca Pieters", contactData, 201879);
        contactData = new ContactData("genesis.kilic@home.com");
        contactData.addPhoneNumber(new PhoneNumber(Kind.FIXED, "03/287.89.75"));
        Customer genesis = new Customer("Genesis Kiliç", contactData, 987968);
        contactData = new ContactData("robin.dworak@dum.com");
        contactData.addPhoneNumber(new PhoneNumber(Kind.FIXED, "03/579.87.99"));
        contactData.addPhoneNumber(new PhoneNumber(Kind.MOBILE, "0436/85.77.35.11"));
        Customer robin = new Customer("Robin Dwořak", contactData, 166789);

        contactData = new ContactData("Lucca Verstraete");
        contactData.addPhoneNumber(new PhoneNumber(Kind.FIXED, "09/157.99.14"));
        Partner lucca = new Partner("Lucca Verstraete", contactData, "BE15799318");
        contactData = new ContactData("raf.ghazi@firma.com");
        contactData.addPhoneNumber(new PhoneNumber(Kind.FIXED, "015/87.77.33"));
        contactData.addPhoneNumber(new PhoneNumber(Kind.MOBILE, "0433/33.55.78"));
        Partner raf = new Partner("Raf Ghazi", contactData, "BE87986469");

        Contacts list = new Contacts();

        list.addContact(bianca);
        list.addContact(genesis);
        list.addContact(robin);
        list.addContact(lucca);
        list.addContact(raf);

        list.removeContact(1);
        list.removeContact(0);
        list.removeContact(4);

        for (int i = 0; i < list.getAmount();i++){
            System.out.println(list.getContact(i));
        }


    }
}
