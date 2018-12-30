import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateRightTriangle{

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter the first side length of the right triangle: ");
        double side1 = checkInput();

        System.out.print("Enter the first side length of the right triangle: ");
        double side2 = checkInput();

        System.out.print("Enter the first side length of the right triangle: ");
        double side3 = checkInput();

        if((side1 > 0 && side2 > 0 && side3 >0)){
            if((side1*side1 + side2*side2 == side3*side3)||
                (side1*side1 + side3*side3 == side2*side2)||
                    (side2*side2 + side3*side3 == side1*side1)){
                        System.out.println("You can create a right triangle with sides'length "+side1+" , "+side2+" and "+side3);
            } else{System.out.println("You can't create a right triangle");}

        }else{
            System.out.println("Expected positive number of the triangle side length");
        }
    }

    public static double checkInput() {
        try {
            return userInput.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Expected double or integer number");
            return -1;
        }
    }
}