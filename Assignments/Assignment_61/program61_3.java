import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class program61_3
 {
    public static void main(String A[]) throws Exception
    {

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String file1 = sobj.nextLine();

        System.out.print("Enter string to append: ");
        String data = sobj.nextLine();

        FileWriter fw = new FileWriter(file1, true);

        fw.write(data);
        fw.close();

        System.out.println("Data appended successfully");
    }
}