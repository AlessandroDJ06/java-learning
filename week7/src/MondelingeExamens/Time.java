package MondelingeExamens;

public class Time {
    private int hours;
    private int minutes;

    public Time(String tijd){
        String[] delen = tijd.split(":");
        this.hours = Integer.parseInt(delen[0]);
        this.minutes = Integer.parseInt(delen[1]);
    }

    public Time(Time time){
        String[] delen = time.toString().split(":");
        this.hours = Integer.parseInt(delen[0].trim());
        this.minutes = Integer.parseInt(delen[1].trim());
    }

    public void addMinutes(int minuten){
        this.minutes += minuten;
        while(this.minutes >= 60){
            this.hours += 1;
            this.minutes -= 60;
        }

    }
    public String toString(){
        return String.format("%02d : %02d",this.hours,this.minutes);
    }
}
