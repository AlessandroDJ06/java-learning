package ModelBouwClub;

public class NormalMember extends Member{
    private String speciality;

    public NormalMember(String name, long number, String speciality) {
        super(name, number);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    @Override
    public String toString() {
        return "NormalMember{" +
                "speciality='" + speciality + '\'' +
                '}'+ super.toString();
    }
}
