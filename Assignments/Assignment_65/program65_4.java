import java.util.Scanner;

class program65_4
{
    public static long ToggleBit(long No)
    {
        long Mask=1<<6;
        long Result=0;

        Result=No ^ Mask;
        Mask=1<<9;
        Result=Result ^ Mask;

        return Result;
    }

    public static void main(String A[])
    {

        long No=0;
        long iRet=0;

        System.out.print("Enter the number : ");
        Scanner sobj=new Scanner(System.in);

        No=sobj.nextLong();

        iRet=ToggleBit(No);

        System.out.println(iRet+" is decimal number after toggling 7th and 10th bit");

        

        sobj.close();


    }
}