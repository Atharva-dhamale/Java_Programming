import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class program62_5
{
    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fname = sobj.nextLine();

        try
        {
            FileInputStream fin = new FileInputStream(fname);

            int ch;
            while((ch = fin.read()) != -1)
            {
                System.out.print((char)ch);
            }

            fin.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found!");
        }
        catch(IOException e)
        {
            System.out.println("Error while reading file");
        }
        finally
        {
            System.out.println("\nOperation finished");
        }
    }
}
