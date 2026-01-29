import java.io.*;

class program63_4
{
    public static void main(String A[]) throws Exception
    {
        File dir = new File("abc");
        File files[] = dir.listFiles();

        FileOutputStream fout = new FileOutputStream("Combined.bin");

        for(File f : files)
        {
            FileInputStream fin = new FileInputStream(f);

            int ch;
            while((ch = fin.read()) != -1)
            {
                fout.write(ch);
            }

            fin.close();
        }

        fout.close();
        System.out.println("Combined.bin created successfully");
    }
}
