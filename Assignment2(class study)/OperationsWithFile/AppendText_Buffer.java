import java.io.*;

public class AppendText_Buffer{

    public static void main(String[] args) throws IOException{
        File f = new File("text.txt");
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        if(!(f.exists())){
            f.createNewFile();
            System.out.println("New file has been created");
        }else{
            System.out.println("The file already exists");
        }

        pw.println("Some text add");
        pw.close();
    }
}