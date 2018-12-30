import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class  CreateWriteFile{

    public static void main(String[] args){
        try
        {
            File file = new File("textFile.txt");

            if(!(file.exists())){
                file.createNewFile();
            }

            PrintWriter pw = new PrintWriter(file);
            pw.println("this my content 1");
            pw.println("this my content 2");
            pw.println("this my content 3");
            pw.println("this my content 4");
            pw.println("this my content 5");
            pw.println(532);
            pw.println(-532.255445);
            pw.println(.5465532);
            pw.close();
            System.out.println("Done");
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}