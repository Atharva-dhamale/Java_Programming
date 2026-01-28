
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class program58_4
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
                fw.write("File Name :"+f.getName()+"\n");

                BufferedReader br=new BufferedReader(new FileReader(f));
                String line;

                while((line=br.readLine())!=null)
                {
                    fw.write("Data in file :"+line+"\n\n");
                }
                br.close();
            }
        }
        fw.close();
        System.out.println("All file data copied");

        sobj.close();

    }
}

