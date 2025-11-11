package Schaken;
import java.util.Random;

public class Player {
    private String name;
    private int birthYear;
    private final int CURRENTYEAR = 2025;
    private double winRatio;
    private boolean retired;
    static Random random = new Random();

    private boolean nameCheck(String name){
        if (name.isEmpty()){
            System.out.println("naam is fout naam wordt op leeg gezet.");
            return false;
        } else {
            return true;
        }
    }

    private boolean ageCheck(int birthYear){
        if ((this.CURRENTYEAR - birthYear) > 0 && (this.CURRENTYEAR - birthYear) < 121 ){
            return true;
        } else {
            System.out.println("Je hebt een foute leeftijd ingegeven , de leeftijd wordt op 18 gezet.");
            return false;
        }
    }

    private boolean winratioCheck(double winRatio){
        if (winRatio > 0 && winRatio < 1){
            return true;
        } else {
            System.out.println("de winratio moet tussen 0 en 1 liggen , hij wordt nu op 0.5 gezet");
            return false;
        }
    }

    public Player(String name, int birthYear, double winRatio, boolean retired) {

        this.name = nameCheck(name)? name:"leeg";
        this.birthYear = ageCheck(birthYear)? birthYear:18;
        this.winRatio = winratioCheck(winRatio)? winRatio:0.5;
        this.retired = retired;
    }

    public void setName(String name) {
        this.name = nameCheck(name)? this.name:"leeg";
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int birthYear) {
        this.birthYear = ageCheck(birthYear)? this.birthYear:18;
    }

    public int getAge() {
        return this.birthYear;
    }

    public void setWinRatio(double winRatio) {
        this.winRatio = winratioCheck(winRatio)? this.winRatio:0.5;
    }

    public double getWinRatio() {
        return this.winRatio;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    public boolean isRetired() {
        return this.retired;
    }

    public String toString() {
        return this.name + " (" + (this.CURRENTYEAR - this.birthYear) + ": Winratio: " + this.winRatio +" " + ((this.retired)? "retired":"active" + ")");
     }

    public boolean play(){
        return this.winRatio > random.nextDouble(0,1);
    }

    public boolean play(Player player ){
        return this.winRatio > player.winRatio;
    }





}
