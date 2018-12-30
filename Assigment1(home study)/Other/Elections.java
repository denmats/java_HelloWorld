import java.util.InputMismatchException;
import java.util.Scanner;

public class Elections{

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter your age: ");
        int age = checkUserInput();

        if(age > 0){
            if(age < 18) {System.out.println("You can't vote");}
            else if((age >=18) && (age < 35)){System.out.println("You can vote, but you can't be a president");}
            else {System.out.println("You can apply for major position");}
        } else {System.out.println("Enter a correct age");}
    }

    public static int checkUserInput(){
        try
        {
            return userInput.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Expected a number");
            return -1;
        }
    }

}