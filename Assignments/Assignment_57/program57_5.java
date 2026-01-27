import java.io.File;
import java.util.Scanner;

class program57_5
{
    public static void main(String A[])
    {
        String dirname="";
        System.out.print("Enter the name of directory :");

        Scanner sobj=new Scanner(System.in);
        dirname=sobj.next();



        File dir=new File(dirname);

        if(dir.exists() && dir.isDirectory())
        {
            File files[]=dir.listFiles();

            for(File file:files)
            {
                System.out.println(file.getName()+"->"+file.length()+"bytes");
            }
        }
        else
        {
            System.out.println("Invalid directory");
        }

        sobj.close();

    }
}