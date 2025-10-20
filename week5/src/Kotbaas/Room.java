package Kotbaas;

public class Room {
    private int roomNumber;
    private Student student;
    private double pricePerMonth;

    public Room(int roomNumber,double pricePerMonth){
        this.roomNumber = roomNumber;
        this.pricePerMonth = pricePerMonth;
        this.student = null;
    }

    public Room(){
        this(0,0);
        this.student = null;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent(){
        return this.student;
    }



    public String toString(){
        String student = (this.student != null)? this.student.toString():"leegstaand";
        return "Kamer " + this.roomNumber + ": " + student + "( " + this.pricePerMonth + "€)";
    }
}
