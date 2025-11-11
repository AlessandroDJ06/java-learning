package MondelingeExamens;

public class Schedule {
    private Time[] times;

    public void createSchedule(int numberOfStudents, int minutesPerExam,Time start){
        this.times = new Time[numberOfStudents];
        Time current = new Time(start);

        for (int i = 0; i < this.times.length;i++){
            this.times[i] = new Time(current);
            current.addMinutes(minutesPerExam);

            String[] delen = current.toString().split(":");
            int hours = Integer.parseInt(delen[0].trim());
            int minutes = Integer.parseInt(delen[1].trim());

            if (hours == 12 || hours == 11 && minutes > 45 ){
                if (hours == 12){
                    current.addMinutes(60);
                }else{
                    current.addMinutes((60-minutes)+60);
                }
            } else if (i == numberOfStudents/4 || i == 3*(numberOfStudents/4)) {
                current.addMinutes(15);
            }

        }


    }

    public void printSchedule(){
        for (Time s : times){
            System.out.println(s.toString());
        }
    }
}
