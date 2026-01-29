import java.io.*;
import java.util.*;

class program62_3
{
    public static void main(String A[]) throws Exception
    {

        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fname = sobj.nextLine();

        System.out.print("Enter N: ");
        int N = sobj.nextInt();

        File file = new File(fname);
        long size = file.length();

        FileInputStream fin = new FileInputStream(file);
        FileOutputStream fout = new FileOutputStream("./abc/lastN.txt");

        long skipBytes = size - N;

        fin.skip(skipBytes);

        int ch;
        while((ch = fin.read()) != -1)
        {
            fout.write(ch);
        }

        fin.close();
        fout.close();

        System.out.println("Last " + N + " bytes copied");
    }
}
