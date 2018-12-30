import java.io.*;

public class ReadFile{

    public  static void main(String[] args){
        try
        {
            getFile("./somestuff.txt");
        }

        catch (IOException e)
        {
            System.out.println("An IO error occurred");
        }

    }

    public static void getFile(String fileName) throws IOException, FileNotFoundException
    {
            FileInputStream file = new FileInputStream(fileName);
    }
}
