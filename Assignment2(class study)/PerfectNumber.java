import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SplittableRandom;

public class PerfectNumber{

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter a number for checking it up for perfectness: ");
        long isAPerfectNumber = checkInput();
        long suma = 1;

//        if(isAPerfectNumber < 0){
//            isAPerfectNumber = Math.abs(isAPerfectNumber);
//        }

        for(int i = 2; i <= isAPerfectNumber/2; i++){
            if(isAPerfectNumber % i == 0){
                suma += i;
            }
        }

        if(suma == isAPerfectNumber){
            System.out.println("The number "+isAPerfectNumber+" is a perfect number");
        }else{
            System.out.println("The number "+isAPerfectNumber+" is not a perfect number");
        }

    }

    public static long checkInput(){
        try {
            return userInput.nextLong();
        }
        catch (InputMismatchException e){
            System.out.println("That isn't a correct number");
            return -1;
        }
    }
}