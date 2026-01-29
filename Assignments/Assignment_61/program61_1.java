import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class program61_1
 {
    public static void main(String A[]) throws Exception
    {
        int ch;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file name: ");
        String file1 = sobj.nextLine();

        System.out.print("Enter destination file name: ");
        String file2 = sobj.nextLine();

        FileInputStream in = new FileInputStream(file1);
        FileOutputStream out = new FileOutputStream(file2);

        
        while((ch = in.read()) != -1) 
        {
            out.write(ch);
        }

        in.close();
        out.close();

        System.out.println("File copied successfully!");

        sobj.close();
    }
}
