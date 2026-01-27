import java.io.File;
import java.util.Scanner;

class program57_2
{
    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String name = sobj.nextLine();

        File f = new File(name);

        if(f.exists() && f.isFile())
        {
            System.out.println("It is a regular file");
        }
            
        else
        {
            System.out.println("Not a regular file");
        }

        sobj.close();
            
    }
}
