
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class program56_3
{
    public static void main(String A[])throws IOException
    {
        String filename="";

        System.out.print("Enter the name of file :");

        Scanner sobj=new Scanner(System.in);
        filename=sobj.next();

        FileWriter fw=new FileWriter(filename,true);

        fw.write("How are you");
        fw.close();

        System.out.println("Data written succesfully");
        
        sobj.close();

    }
}