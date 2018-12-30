import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci{

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        int k = 0, a = 1, b = 1;


        System.out.println("Enter the number: ");
        int fibo = checkInput();

        if(fibo > 0) {
            System.out.print("1 1 ");

            while (k <= fibo) {
                k = a + b;
                if (k >= fibo) {
                    break;
                }
                System.out.print(k + " ");
                a = b;
                b = k;
            }
        }
    }

    public static int checkInput(){
        try
        {
            return userInput.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Enter correct number next time");
            return -1;
        }
    }
}