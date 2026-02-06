import java.util.Scanner;

class program66_5
{
    public static long ToggleBit(long No)
    {
        long Mask=0xF000000FL;
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

        System.out.println("After Toggling The decimal number is :"+iRet);

       

        sobj.close();


    }
}