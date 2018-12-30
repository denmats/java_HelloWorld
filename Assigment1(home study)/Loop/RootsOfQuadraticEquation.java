/*
* ax + bx +cx = 0
* delta = b^2 - 4ac;
* x1 = (-b-sqr(delta))/2a
* x2 = (-b+sqr(delta))/2a
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class RootsOfQuadraticEquation{

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter first element of equation (a): ");
        double a = checkInput();

        System.out.print("Enter second element of equation (b): ");
        double b = checkInput();

        System.out.print("Enter third element of equation (c): ");
        double c = checkInput();

        double x1, x2, x0;

        //look for delta
        double delta = b*b - 4 * a * c;
        if(delta > 0){
            x1 = (-b - Math.sqrt(delta))/2*a;
            System.out.println("The first zero places x1 is "+x1);
            x2 = (-b + Math.sqrt(delta))/2*a;
            System.out.println("The second zero places x2 is "+x2);
        }else if(delta == 0){
            x0 = -b / 2 * a;
            System.out.println("The only zero place x0 is "+x0);
        }else{
            System.out.println("The lack of zero places and" +
                    " equation does not decompose into linear factors");
        }

    }

    public static double checkInput(){
        try{
            return userInput.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("Enter correct number next time");
            return -1;
        }
    }
}