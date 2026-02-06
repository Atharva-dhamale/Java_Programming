import java.util.Scanner;

class program64_3
{
    public static boolean ChkBit(int No)
    {
        int Mask=0x8104040;
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
            System.out.println("7th , 15th , 21th and 28th bit is ON");
        }
        else
        {
           System.out.println("7th , 15th , 21th and 28th bit is OFF"); 
        }

        sobj.close();


    }
}