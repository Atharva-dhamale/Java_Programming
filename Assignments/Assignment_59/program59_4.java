
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

class program59_4
{
    public static void main(String A[])throws IOException
    {
        String dirname="";
        int iCount1=0;
        int iCount2=0;
        System.out.print("Enter the name of directory :");

        Scanner sobj=new Scanner(System.in);
        dirname=sobj.next();



        File dir=new File(dirname);
        File files[]=dir.listFiles();
        
        for(File f:files)
        {
            if(f.isFile())
            {
                iCount1++;
            }
            else if(f.isDirectory())
            {
               iCount2++;
            }
        }

        System.out.println("Number of regular files are :"+iCount1);
        System.out.println("Number of Directory are :"+iCount2);


        sobj.close();

    }
}

