import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumbers{

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter a number to figure out wheather this a  prime number : ");
        int isAPrimeNumber = checkInput();
        boolean flag = true;
        if(isAPrimeNumber == 2){
            System.out.println("2 is a prime number");
        }

        for(int i = 2; i < isAPrimeNumber; i++){
            if(isAPrimeNumber % i == 0){
                flag = false;
                break;
            }
        }

        if((flag == true) && (isAPrimeNumber >2)){
            System.out.println(isAPrimeNumber+" is a prime number");
        }else{
            System.out.println("This number is not a prime number");
        }

    }

    public static int checkInput(){
        try {
            return userInput.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("That isn't a correct number");
            return -1;
        }
    }
}