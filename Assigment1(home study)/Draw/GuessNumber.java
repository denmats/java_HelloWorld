import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber{

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Guess number from 2 to 5");
        int guess = checkInput();
        int attempt = 1;
        boolean flag =true;

        Random rand = new Random();
        int winNumber = rand.nextInt((5-2)+1) + 2;

        while(guess != winNumber){
            if(guess > winNumber) {
                System.out.println("Your guess is bigger than winnig number");
            }else{
                System.out.println("Your guess is less than winnig number");
            }

            attempt++;

            guess =checkInput();
            if(guess == -1000000){
                flag = false;
               break;
            }
        }

        if(flag){
            System.out.println("You win! You guessed it in  "+attempt+" attempts");
        }
    }

    public static int checkInput(){
        try
        {
            return userInput.nextInt();
        }
        catch (InputMismatchException e){
            e.getMessage();
            return -1000000;
        }
    }
}