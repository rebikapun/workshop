import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException; 
import java.util.Scanner;

public class WriteNamesToFile 
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter ("U:\\Computer Science\\name.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the names of the people in your group");
        String content = scan.nextLine();

        bw.newLine();
        bw.write(content);
        bw.close();

        System.out.println("Done");
        
        

    }
}
