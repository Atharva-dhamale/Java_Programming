import java.io.File;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

class program57_4
{
    public static void main(String A[])throws IOException
    {
        int ch=0;
        long checksum=0;

        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String name = sobj.nextLine();

        FileInputStream in = new FileInputStream(name);

        while((ch=in.read())!=-1)
        {
            checksum+=ch;
        }
        in.close();

        System.out.println("Checksum is:"+checksum);

        sobj.close();
            
    }
}
