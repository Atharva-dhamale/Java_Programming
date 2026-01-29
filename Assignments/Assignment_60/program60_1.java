import java.io.File;
import java.util.Scanner;
import java.io.IOException;

class program60_1
{
    public static void main(String A[])throws IOException
    {
        long Count=0;
        String dirname="";
        System.out.print("Enter the name of directory :");

        Scanner sobj=new Scanner(System.in);
        dirname=sobj.next();



        File dir=new File(dirname);
        File files[]=dir.listFiles();
        
        for(File f:files)
        {
            if(f.isFile())
            {
               Count=Count+f.length();
            }
        }
        System.out.println("Total size of all files is :"+Count);

        sobj.close();

    }
}
