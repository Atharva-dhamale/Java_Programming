import java.io.File;
import java.util.Scanner;
import java.io.IOException;

class program59_5
{
    public static void main(String A[])throws IOException
    {
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
               System.out.println(f.getAbsolutePath());
            }
        }

        sobj.close();

    }
}


