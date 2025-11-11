import java.util.Scanner;

public class Opwarmertje {
    static Scanner scanner = new Scanner(System.in);

    public static void inputTemperatures(double[] temperaturen){
        for (int i = 0; i < temperaturen.length; i++){
            System.out.printf("Dag %d : ",i+1);
            temperaturen[i] = scanner.nextDouble();
        }
    }
    public static String printTemperatures(double[] temperaturen,double gemiddelde){
        StringBuilder sb = new StringBuilder();

        sb.append("overzicht").append("\n").append("==================").append("\n");

        for (int i = 0; i < temperaturen.length; i++){
            sb.append("Dag ").append(i+1).append(" : ").append(temperaturen[i]).append("\n");
        }

        sb.append("==================").append("\n").append("Gemiddelde: ").append(String.format("%.2f",gemiddelde));
        return sb.toString();
    }

    public static double calculateAverage(double[] temperaturen){
        double som = 0;

        for (double s : temperaturen){
            som += s;
        }

        return som/temperaturen.length;
    }

    public static void main(String[] args) {
        final int NUMBER_OF_TEMPERATURES = 7;
        double[] temperaturen = new double[NUMBER_OF_TEMPERATURES];

        inputTemperatures(temperaturen);
        System.out.println("\n");
        System.out.println(printTemperatures(temperaturen,calculateAverage(temperaturen)));



    }
}
