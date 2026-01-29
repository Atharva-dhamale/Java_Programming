import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class program61_2
 {
    public static void main(String A[]) throws Exception
    {
        int ch;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file name: ");
        String file1 = sobj.nextLine();

        System.out.print("Enter destination file name: ");
        String file2 = sobj.nextLine();

        FileInputStream fin = new FileInputStream(file1);
        FileOutputStream fout = new FileOutputStream(file2);

        byte buffer[] = new byte[1024];
        int bytesRead;

        while((bytesRead = fin.read(buffer)) != -1)
        {
            fout.write(buffer, 0, bytesRead);
        }

        fin.close();
        fout.close();

        System.out.println("File copied using buffer");

        sobj.close();
    }
}
