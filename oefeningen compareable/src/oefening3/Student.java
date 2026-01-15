package oefening3;

public class Student {
    private String voornaam;
    private String achternaam;

    public Student(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    @Override
    public String toString() {
        return "Student{" +
                "voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                '}';
    }
}
