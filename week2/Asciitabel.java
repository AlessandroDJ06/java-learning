package week2;

public class Asciitabel {
    public static void main(String[] args) {
        int maxRow = 6;
        int currentRow = 0;
        int code = 32;

        while(code <= 127){
            while(currentRow != maxRow && code <= 127){
                System.out.print((char)code + "( "+code + " ) ");
                currentRow++;
                code++;
            }
            currentRow = 0;
            System.out.print("\n");
        }

    }
}
