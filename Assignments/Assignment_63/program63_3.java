import java.io.*;

class program63_3
{
    public static void main(String A[]) throws Exception
    {
        File srcDir = new File("abc");
        File destDir = new File("xyz");

        destDir.mkdir();

        File files[] = srcDir.listFiles();

        for(File f : files)
        {
            FileInputStream fin = new FileInputStream(f);
            FileOutputStream fout = new FileOutputStream(destDir + "/" + f.getName());

            int ch;
            while((ch = fin.read()) != -1)
            {
                fout.write(ch);
            }

            fin.close();
            fout.close();
        }

        System.out.println("All files copied!");
    }
}
