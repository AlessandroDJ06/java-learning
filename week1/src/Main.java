import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("enter second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("choose operator: (/,*,-,+) ");
        String operator = scanner.next();

        if (operator.equals("/")) {
            System.out.print(firstNumber + " / " + secondNumber + " = " + firstNumber / secondNumber);
        }
        else if (operator.equals("*")) {
            System.out.print(firstNumber + " * " + secondNumber + " = " + firstNumber * secondNumber);
        }
        else if (operator.equals("-")) {
            System.out.print(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        }
        else{
            System.out.print(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        }

    }
}
