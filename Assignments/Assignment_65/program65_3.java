import java.util.Scanner;

class program65_3
{
    public static long ToggleBit(long No)
    {
        long Mask=1<<6;
        long Result=0;

        Result=No ^ Mask;

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

        System.out.println(iRet+" is decimal number after toggling 7th bit");

        

        sobj.close();


    }
}