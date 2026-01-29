import java.io.*;

class program63_5
{
    public static void main(String A[]) throws Exception
    {
        FileInputStream fin = new FileInputStream("Combined.bin");
        FileOutputStream fout = new FileOutputStream("Output.bin");

        byte buffer[] = new byte[1024];

        int bytesRead = fin.read(buffer);
        fout.write(buffer, 0, bytesRead);

        fin.close();
        fout.close();

        System.out.println("First 1KB copied into Output.bin");
    }
}
