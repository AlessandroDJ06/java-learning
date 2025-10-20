package StudentencijferEvaluator;

public class Student {
    private String name;
    private int id;
    private double cijfer;

    public Student(String name,int id,double cijfer){
        this.name = name;
        this.id = id;
        this.cijfer = cijfer;
    }
    public boolean nameCorrect(){
        if (this.name.isEmpty()) {
            return false;
        } else if (!this.name.contains(" ")) {
            return false;
        } else {
            return true;
        }
    }
    public boolean idCorrect(){
        return this.id > 0;
    }

    public boolean cijferCorrect(){
        return (this.cijfer >= 0) && (this.cijfer <= 100);
    }

    public String getName() {
       return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    public double getCijfer() {
        return this.cijfer;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrestatieCategorie(){
        int cijfer = (int)Math.round(this.cijfer/10)*10;
        return switch(cijfer){
            case 100,90 -> "Excellent";
            case 80,75 ->  "Goed";
            case 70,60,50 -> "voldoende" ;
            default -> "onvoldoende";
        };
    }

}
