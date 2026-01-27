
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class program56_2
{
    public static void main(String A[])
    {
        String filename="";
        String line="";

        System.out.print("Enter the name of file :");

        Scanner sobj=new Scanner(System.in);
        filename=sobj.next();


        try
        {
            BufferedReader br=new BufferedReader(new FileReader(filename));

            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch(IOException e)
        {
            System.out.println("Error while reading file");
        }

        
        sobj.close();

    }
}