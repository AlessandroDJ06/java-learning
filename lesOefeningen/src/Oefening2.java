import java.util.Scanner;
public class Oefening2 {

    public static void main(String[] args) {
        int[][] array = new int[3][];


        array[0] = new int[5];
        for (int i = 0; i < 5 ; i++ ){
            array[0][i] = i+1;
        }

        Scanner scanner = new Scanner(System.in);
        array[1] = new int[1];
        System.out.print("Geef een getal: ");
        array[1][0] = scanner.nextInt();
        array[2] = new int[10];
        for (int i = 0;i < 10;i++){
            array[2][i] = (i+1) * 7;
        }

        for (int[] i : array){
            for (int getal : i){
                System.out.print(getal + " ");
            }
            System.out.println();
        }


    }
}
