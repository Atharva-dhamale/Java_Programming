
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class program58_2
{
    public static void main(String A[])throws IOException
    {
        String dirname="";
        System.out.print("Enter the name of directory :");

        Scanner sobj=new Scanner(System.in);
        dirname=sobj.next();



        File dir=new File(dirname);
        File files[]=dir.listFiles();

        FileWriter fw=new FileWriter("Marvellous.txt");
        
        for(File f:files)
        {
            if(f.isFile())
            {
                fw.write(f.getName()+"\n");
            }
        }
        fw.close();
        System.out.println("File names written succesfully");

        sobj.close();

    }
}

