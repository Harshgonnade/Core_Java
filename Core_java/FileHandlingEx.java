import java.io.FileWriter;

public class FileHandlingEx 
{
    public static void main(String[] args) 
    {
        FileWriter fw = new FileWriter("abc.txt");

        String str1="Java Class";
        String str2="Exam on monday";

        fw.write(str1);
        fw.write(str2);

        System.out.println("File writw is over");

        fw.close();
    }    
}
