import java.io.File;
import java.util.Scanner;

class program57_3
{
    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter directory name: ");
        String name = sobj.nextLine();

        File f = new File(name);

        if(f.mkdir())
        {
            System.out.println("Directory created");
        }
            
        else
        {
            System.out.println("Directory already exists or error");
        }

        sobj.close();

            
    }
}
