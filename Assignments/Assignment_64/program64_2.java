import java.util.Scanner;

class program64_2
{
    public static boolean ChkBit(int No)
    {
        int Mask=0x20010;
        int Result=0;

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
        int No=0;
        boolean bRet=false;

        System.out.print("Enter the number : ");
        Scanner sobj=new Scanner(System.in);

        No=sobj.nextInt();

        bRet=ChkBit(No);

        if(bRet==true)
        {
            System.out.println("5th and 18th bit is ON");
        }
        else
        {
           System.out.println("5th and 18th bit is OFF"); 
        }

        sobj.close();


    }
}