import java.util.Scanner;

class program64_5
{
    public static boolean ChkBit(long No)
    {
        long Mask=0x80000001L;
        long Result=0;

        Result=No & Mask;

        if(Result==Mask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String A[])
    {

        long No=0;
        boolean bRet=false;

        System.out.print("Enter the number : ");
        Scanner sobj=new Scanner(System.in);

        No=sobj.nextLong();

        bRet=ChkBit(No);

        if(bRet==true)
        {
            System.out.println("1st and 32th bit is ON");
        }
        else
        {
           System.out.println("1st and 32th bit is OFF"); 
        }

        sobj.close();


    }
}