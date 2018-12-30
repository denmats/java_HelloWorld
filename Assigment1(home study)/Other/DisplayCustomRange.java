import java.util.InputMismatchException;
import java.util.Scanner;

public class DisplayCustomRange{

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter start number of range: ");
        int start = checkInput();

        System.out.println("Enter last number of range: ");
        int last = checkInput();

        if(start < last){
            for(int i = start; i <= last; i++) {
                System.out.println(i);
            }
        }else {
            for(int i = start; i >= last; i--) {
                System.out.println(i);
            }
        }
    }

    public static int checkInput(){
        try
        {
            return userInput.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter an integer number next time");
            return 0;
        }
    }
}