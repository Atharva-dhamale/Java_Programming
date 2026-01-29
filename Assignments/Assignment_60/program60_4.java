import java.io.File;
import java.util.Scanner;

class program60_4
{
    public static void main(String A[])
    {
        String dirname="";
        System.out.print("Enter the name of directory :");
        Scanner sobj=new Scanner(System.in);
        dirname=sobj.next();

        System.out.print("Enter extension :");
        String ext = sobj.next();

        



        File dir=new File(dirname);
        File files[]=dir.listFiles();
        

        for(File f : files)
            {
                if(f.isFile() && f.getName().endsWith(ext))
                {
                    System.out.println(f.getName());
                }
        }

        sobj.close();

    }
}
