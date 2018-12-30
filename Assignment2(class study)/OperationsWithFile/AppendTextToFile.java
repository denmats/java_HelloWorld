import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendTextToFile{

    public static void write(String s, File f) throws IOException {
        FileWriter fw = new FileWriter(f, true);
        fw.write(s);
        fw.close();
    }

    public static void main(String[] args)
    {
        try {
            File f = new File("textFile.txt");
            write("Append some text to existing text", f);
            System.out.println("Done");
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}