import java.io.*;
import java.util.*;

class program62_2
{
    public static void main(String A[]) throws Exception
    {

        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fname = sobj.nextLine();

        System.out.print("Enter N: ");
        int N = sobj.nextInt();

        FileInputStream fin = new FileInputStream(fname);
        FileOutputStream fout = new FileOutputStream("./abc/firstN.txt");

        int ch;
        int count = 0;

        while((ch = fin.read()) != -1 && count < N)
        {
            fout.write(ch);
            count++;
        }

        fin.close();
        fout.close();

        System.out.println("First " + N + " bytes copied");
    }
}
