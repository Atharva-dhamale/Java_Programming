import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class program61_4
 {
    public static void main(String A[]) throws Exception
    {

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first file name: ");
        String file1 = sobj.nextLine();

        System.out.print("Enter Second file name: ");
        String file2 = sobj.nextLine();

        System.out.print("Enter output file name: ");
        String file3 = sobj.nextLine();

        FileOutputStream fout = new FileOutputStream(file3);

        FileInputStream fin1 = new FileInputStream(file1);
        FileInputStream fin2 = new FileInputStream(file2);

        int ch;

        while((ch = fin1.read()) != -1)
            fout.write(ch);

        while((ch = fin2.read()) != -1)
            fout.write(ch);

        fin1.close();
        fin2.close();
        fout.close();

        System.out.println("Files merged successfully");
    }
}