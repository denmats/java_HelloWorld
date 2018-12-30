import java.util.InputMismatchException;
import java.util.Scanner;

public class GetMaximumNumber{

    static Scanner scan= new Scanner(System.in);

    public static void main(String args[])
    {
        System.out.println("Finder the maximum number from three ones");

        //Check the first number
        System.out.print("Enter the first number: ");
        double num1 = checkNumber();

        //Check the second number
        System.out.print("Enter the second number: ");
        double num2= checkNumber();

        //Check the third number
        System.out.print("Enter the third number: ");
        double num3= checkNumber();

        //Find the maximum number
        double maxNumber = getMaxNumber(num1, num2, num3);
        System.out.println("The maximum number is: " + maxNumber);
    }

    public static double checkNumber()
    {
        try
        {
            return scan.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Enter a correct number next time");
            return 0;
        }
    }

    public static double getMaxNumber(double a, double b, double c)
    {
        double max = a;

        if (b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }

        return max;
    }
}








