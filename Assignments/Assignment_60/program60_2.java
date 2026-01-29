import java.io.File;
import java.util.Scanner;
import java.io.IOException;

class program60_2
{
    public static void main(String A[])throws IOException
    {
        String dirname="";
        System.out.print("Enter the name of directory :");

        Scanner sobj=new Scanner(System.in);
        dirname=sobj.next();



        File dir=new File(dirname);
        File files[]=dir.listFiles();
        
        File largest = files[0];

        for(File f : files)
            {
                if(f.isFile() && f.length() > largest.length())
                {
                    largest = f;
                }
        }

        System.out.println("Largest file: " + largest.getName());

        sobj.close();

    }
}
