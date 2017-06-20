import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException; 
import java.util.Scanner;

public class ReadFromNameFile
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter ("U:\\Computer Science\\name.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        String line = bw.readLine();
        
        do {
        System.out.println(line);
    } while (line = br.readLine() );
        
        

    }
}