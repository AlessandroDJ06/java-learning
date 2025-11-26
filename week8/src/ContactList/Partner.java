package Contacten;

public class Partner extends Contact{
    private String companyNumber;

    public Partner(String name, ContactData contactData,String companyNumber){
        super(name,contactData);
        this.companyNumber = companyNumber;
    }

    public String getCompanyNumber(){
        return this.companyNumber;
    }

    public String toString(){
        return super.toString() + String.format("companynumber: %s",this.companyNumber);
    }
}
