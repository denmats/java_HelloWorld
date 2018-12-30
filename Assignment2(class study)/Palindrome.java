import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome{

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter an integer number you want check for palindrome: ");
        long n = checkInput();
        long tmp = n;
        long newNum = 0;

        while (n > 0){
            newNum = newNum * 10 + n%10;
            n /=10;
        }

        if(newNum == tmp){
            System.out.println("The "+tmp+ " is  palindrome");
        }else{
            System.out.println("The "+tmp+ " is not palindrome");
        }

    }

    public static long checkInput(){
        try
        {
            return userInput.nextLong();
        }
        catch (InputMismatchException e){
            System.out.println("That isn't a correct number");
            return -1;
        }
    }
}