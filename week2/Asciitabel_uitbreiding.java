package week2;
import java.util.Scanner;

public class Asciitabel_uitbreiding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxRow = 6;
        int currentRow = 0;
        int beginCode;
        int eindCode;

        System.out.print("geef je begin code: ");
        beginCode = scanner.nextInt();
        System.out.print("geef je eind code: ");
        eindCode = scanner.nextInt();


        while(beginCode <= eindCode){
            while(currentRow != maxRow && beginCode <= eindCode){
                System.out.print((char)beginCode + "( "+beginCode + " ) ");
                currentRow++;
                beginCode++;
            }
            currentRow = 0;
            System.out.print("\n");
        }

    }
}
