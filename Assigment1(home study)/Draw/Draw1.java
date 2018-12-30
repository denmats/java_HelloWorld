import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Draw1 {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter start number of random number range: ");
        int rangeStart = checkInput();

        System.out.println("Enter last number of random number range: ");
        int rangeLast = checkInput();

        int drawnNumber;
        Random draw = new Random();

        drawnNumber = draw.nextInt((rangeLast - rangeStart) + 1) + rangeStart;
        System.out.print(drawnNumber);

    }

    public static int checkInput() {
        try {
            return userInput.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter correct number next time");
            return -1;
        }
    }
}