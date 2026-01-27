import java.io.File;
import java.util.Scanner;
import java.io.IOException;

class program56_1
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
                if(file.exists())
                {
                    System.out.println("File opened succesfully");
                }
                
            }
        }
        
        catch(IOException e)
        {
    
            System.out.println("File not found");
        }

        sobj.close();

    }
}