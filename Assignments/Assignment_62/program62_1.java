import java.io.*;
import java.util.*;

class program62_1
{
    public static void main(String A[]) throws Exception
    {

        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fname = sobj.nextLine();

        FileInputStream fin = new FileInputStream(fname);

        int ch;
        int count = 0;

        while((ch = fin.read()) != -1)
        {
            count++;
        }

        fin.close();

        System.out.println("Total bytes = " + count);
    }
}
