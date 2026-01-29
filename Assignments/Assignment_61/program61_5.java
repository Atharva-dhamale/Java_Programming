import java.io.*;
import java.util.*;

class program61_5
{
    public static void main(String A[]) throws Exception
    {

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fname = sobj.nextLine();

        File file = new File(fname);
        long size = file.length();
        long half = size / 2;

        FileInputStream fin = new FileInputStream(file);

        FileOutputStream fout1 = new FileOutputStream("firstHalf.txt");
        FileOutputStream fout2 = new FileOutputStream("secondHalf.txt");

        int ch;
        long count = 0;

        while((ch = fin.read()) != -1)
        {
            if(count < half)
            {
                fout1.write(ch);
            }
            else
            {
                fout2.write(ch);
            }
            count++;
        }

        fin.close();
        fout1.close();
        fout2.close();

        System.out.println("File split successfully");
    }
}
