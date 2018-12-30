import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideTwoNumber {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a num1: ");
        int num1 = checkNumber();

        System.out.print("Enter a num2: ");
        int num2 = checkNumber();

        divideTwoNumbers(num1, num2);
    }

    private static void divideTwoNumbers(int num1, int num2) {
        try {
            System.out.println(num1 + " divided by " + num2 + " is: " + num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int checkNumber() {
        try {
            return userInput.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter a correct format of the number next time");
            return 0;
        }
    }
}
