import java.util.InputMismatchException;
import java.util.Scanner;

public class DisplayAscendRangeFromThreeNumbers{

    static Scanner scan= new Scanner(System.in);

    public static void main(String args[])
    {
        System.out.println("Finder the maximum number from three ones");

        //Check the first number
        System.out.print("Enter the first number: ");
        double a = checkNumber();

        //Check the second number
        System.out.print("Enter the second number: ");
        double b = checkNumber();

        //Check the third number
        System.out.print("Enter the third number: ");
        double c = checkNumber();


        if(((a - b) >= c) && (b >= c)){
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }else if(((a - b) >= c) && (c > b)) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }else if(((b - c) >= a) && (c >= a)) {
             System.out.println(a);
             System.out.println(c);
             System.out.println(b);
         }else if(((b - c) >= a) && (a > c)) {
             System.out.println(c);
             System.out.println(a);
             System.out.println(b);
         }else if(((c - a) >= b) && (a >= b)) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }else  {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }

    public static double checkNumber()
    {
        try
        {
            return scan.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Enter a correct number next time");
            return -1;
        }
    }
}