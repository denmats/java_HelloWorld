import java.util.InputMismatchException;
import java.util.Scanner;

public class DecToBin{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Enter a decimal number you want  to turn into a binary number: ");
        int dec = checkInteger();

        if(dec != -1){
            String bin = "";
            while (dec > 0){
                if(dec%2 == 1){
                    bin = '1'+bin;
                }else{
                    bin = '0' + bin;
                }
                dec = dec/2;
            }

            System.out.println("The binary number is " + bin);
        }
    }

    public static int checkInteger(){
        try
        {
            return userInput.nextInt();
        }
        catch (InputMismatchException e){
            userInput.next();
            System.out.println("Enter correct number next time");
            return -1;
        }
    }
}