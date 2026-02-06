import java.util.Scanner;

class program65_2
{
    public static long OffBit(long No)
    {
        long Mask=0x240L;
        long Result=0;

        Result=~Mask;

        Result=No & Result;

        return Result;
    }

    public static void main(String A[])
    {

        long No=0;
        long iRet=0;

        System.out.print("Enter the number : ");
        Scanner sobj=new Scanner(System.in);

        No=sobj.nextLong();

        iRet=OffBit(No);

        System.out.println(iRet+" is decimal number after turning OFF 7th and 10th bit");

        

        sobj.close();


    }
}