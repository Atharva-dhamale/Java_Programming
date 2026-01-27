import java.io.File;
import java.util.Scanner;

class program56_5
{
    public static void main(String A[])
    {
        String dirname="";
        System.out.print("Enter the name of directory :");

        Scanner sobj=new Scanner(System.in);
        dirname=sobj.next();



        File dir=new File(dirname);

        String files[]=dir.list();

        if(files!=null)
        {
            for(String f:files)
            {
                System.out.println(f);
            }
        }
        else
        {
            System.out.println("Invalid directory");
        }
       

        sobj.close();

    }
}