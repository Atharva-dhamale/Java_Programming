import java.util.Scanner;

class program65_5
{
    public static long ONBit(long No)
    {
        long Mask=0xfL;
        long Result=0;


        Result=No | Mask;

        return Result;
    }

    public static void main(String A[])
    {

        long No=0;
        long iRet=0;

        System.out.print("Enter the number : ");
        Scanner sobj=new Scanner(System.in);

        No=sobj.nextLong();

        iRet=ONBit(No);

        System.out.println(iRet+" is decimal number after turning ON first 4 bits");

        

        sobj.close();


    }
}