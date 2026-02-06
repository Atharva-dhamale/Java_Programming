import java.util.Scanner;

class program66_1
{
    public static boolean ChkBit(long No,int Pos)
    {
        long Mask=1L<<(Pos-1);
        long Result=0;

        Result=No & Mask;

        return (Result==Mask);
    }

    public static void main(String A[])
    {

        long No=0;
        int Pos=0;
        boolean bRet=false;

        System.out.print("Enter the number : ");
        Scanner sobj=new Scanner(System.in);
        No=sobj.nextLong();

        System.out.print("Enter the position : ");
        Pos=sobj.nextInt();

        bRet=ChkBit(No,Pos);

        if(bRet==true)
        {
            System.out.println(Pos+"th bit is ON");
        }
        else
        {
           System.out.println(Pos+"th bit is OFF"); 
        }

        sobj.close();


    }
}