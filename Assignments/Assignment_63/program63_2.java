import java.io.*;

class program63_2
{
    public static void main(String A[]) throws Exception
    {
        long start, end;

        start = System.currentTimeMillis();
        FileInputStream fin1 = new FileInputStream("./abc/c.c");
        FileOutputStream fout1 = new FileOutputStream("normal.txt");

        int ch;
        while((ch = fin1.read()) != -1)
        {
            fout1.write(ch);
        }

        fin1.close();
        fout1.close();
        end = System.currentTimeMillis();

        System.out.println("Normal Stream Time: " + (end-start) + " ms");

        start = System.currentTimeMillis();
        BufferedInputStream fin2 = new BufferedInputStream(new FileInputStream("./abc/c.c"));
        BufferedOutputStream fout2 = new BufferedOutputStream(new FileOutputStream("buffered.txt"));

        while((ch = fin2.read()) != -1)
        {
            fout2.write(ch);
        }

        fin2.close();
        fout2.close();
        end = System.currentTimeMillis();

        System.out.println("Buffered Stream Time: " + (end-start) + " ms");
    }
}
