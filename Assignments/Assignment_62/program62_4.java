import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class program62_4
 {
    public static void main(String A[]) throws Exception
    {
        int ch;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String file1 = sobj.nextLine();


        FileInputStream in = new FileInputStream(file1);
        FileOutputStream out = new FileOutputStream("./Backup.txt");

        
        while((ch = in.read()) != -1) 
        {
            out.write(ch);
        }

        in.close();
        out.close();

        System.out.println("Backup successfully!");

        sobj.close();
    }
}
