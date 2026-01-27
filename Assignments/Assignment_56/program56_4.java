import java.io.File;
import java.util.Scanner;
import java.io.IOException;

class program56_4
{
    public static void main(String A[])
    {
        String filename="";
        System.out.print("Enter the name of file :");

        Scanner sobj=new Scanner(System.in);
        filename=sobj.next();



        File file=new File(filename);

        try
        {
            if(file.createNewFile())
            {
                System.out.println("New file created");
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        
        catch(IOException e)
        {
    
            System.out.println("Error while creating file");
        }

        sobj.close();

    }
}