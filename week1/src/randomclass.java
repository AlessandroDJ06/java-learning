package week1.src;

import java.util.Random;

public class randomclass {
    public static void main(String[] args){
        Random random = new Random();

        int number;
        double number2;
        boolean heads;

        number = random.nextInt(1, 7);
        number2 = random.nextDouble(1, 7);
        heads = random.nextBoolean();

        System.out.println(number);
        System.out.println(number2);
        System.out.println(heads);
    }
}
