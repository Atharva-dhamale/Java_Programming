import java.io.File;
import java.util.Scanner;

class program60_5
{
    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter path: ");
        String path = sobj.next();

        File f = new File(path);

        if(f.exists())
        {
            if(f.isFile())
            {
                System.out.println("It is a File");
            }
                
            else if(f.isDirectory())
            {
                System.out.println("It is a Directory");
            }
                
        }
        else
        {
            System.out.println("Path does not exist");
        }
    }
}
