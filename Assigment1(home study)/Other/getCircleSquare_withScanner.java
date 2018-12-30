import java.util.*;
import java.util.Scanner;

public class getCircleSquare_withScanner{

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[]  args)
    {   System.out.print("Enter radius: ");
        double checkRadius = checkRadius();

        if(checkRadius > 0 ){
            System.out.println("The circle square is : " +2 * Math.PI * checkRadius);
        }
    }

    public static double checkRadius(){
        try
        {
            return userInput.nextDouble();
        }

        catch (InputMismatchException e)
        {
            userInput.next();
            System.out.println("That isn't a positive number ");
            return 0;
        }
    }
}