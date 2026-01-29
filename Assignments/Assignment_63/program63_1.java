import java.io.*;
import java.util.Scanner;

class program63_1
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file: ");
        String src = sobj.nextLine();

        System.out.print("Enter destination file: ");
        String dest = sobj.nextLine();

        BufferedInputStream bin = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(dest));

        int ch;
        while((ch = bin.read()) != -1)
        {
            bout.write(ch);
        }

        bin.close();
        bout.close();

        System.out.println("File copied successfully (Buffered)");
    }
}
