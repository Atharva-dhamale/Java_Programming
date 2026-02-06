import java.util.Scanner;

class program66_2
{
    public static long OffBit(long No,int Pos)
    {
        long Mask=1L<<(Pos-1);
        long Result=0;

        Result=~Mask;

        Result=No & Result;

        return Result;
    }

    public static void main(String A[])
    {

        long No=0;
        int Pos=0;
        long iRet=0;

        System.out.print("Enter the number : ");
        Scanner sobj=new Scanner(System.in);
        No=sobj.nextLong();

        System.out.print("Enter the position : ");
        Pos=sobj.nextInt();

        iRet=OffBit(No,Pos);

        System.out.println("After turning OFF the "+Pos+"th bit ,The decimal number is :"+iRet);

       

        sobj.close();


    }
}