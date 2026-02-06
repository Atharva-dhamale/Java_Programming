import java.util.Scanner;

class program67_3
{
    public static boolean ChkBit(long No)
    {
        long Mask1=0x100L;
        long Mask2=0x800L;
        long Result1=0;
        long Result2=0;

        Result1=No & Mask1;
        Result2=No & Mask2;

        if((Result1==Mask1)||(Result2==Mask2))
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
            System.out.println("9th or 12th bit is ON");
        }
        else
        {
           System.out.println("9th or 12th bit is OFF"); 
        }

        sobj.close();


    }
}