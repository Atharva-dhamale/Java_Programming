import java.io.File;
import java.util.Scanner;
import java.io.IOException;

class program60_3
{
    public static void main(String A[])throws IOException
    {
        String dirname="";
        System.out.print("Enter the name of directory :");

        Scanner sobj=new Scanner(System.in);
        dirname=sobj.next();



        File dir=new File(dirname);
        File files[]=dir.listFiles();
        
        File smallest = files[0];

        for(File f : files)
            {
                if(f.isFile() && f.length() < smallest.length())
                {
                    smallest = f;
                }
        }

        System.out.println("Largest file: " + smallest.getName());

        sobj.close();

    }
}
