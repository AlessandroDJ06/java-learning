package week1.src;
import java.util.Scanner;
public class tafels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gevraagdetafel;
        int count = 0;
        String doorgaan = "j";



        while (doorgaan.equals("j")){
            System.out.print("van welk getal wil je de tafel weten?: ");
            gevraagdetafel = scanner.nextInt();
            while(count != 11){
                System.out.println(count + "*" + gevraagdetafel + "=" + (count*gevraagdetafel));
                count++;
            }
            count = 0;
            System.out.print("wil je een andere tafel hebben?(j/n): ");
            doorgaan = scanner.next();

        }


        scanner.close();
    }
}
