import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateTriangle_version2{

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter the first side length of the triangle: ");
        double side1 = checkInput();

        System.out.print("Enter the first side length of the triangle: ");
        double side2 = checkInput();

        System.out.print("Enter the first side length of the triangle: ");
        double side3 = checkInput();

        double max;

        max = (side1 > side2) ? side1:side2;
        if(max < side3){
            max = side3;
        }

        if(((side1 + side2 + side3) - max) > max){
            System.out.println("You can create a triangle with sides'length "+side1+" , "+side2+" and "+side3);
        }else{
            System.out.println("You can't create a triangle");
        }
    }

    public static double checkInput(){
        try
        {
            return userInput.nextDouble();
        }
        catch (InputMismatchException e){
            System.out.println("Expected double or integer number");
            return -1;
        }
    }

}