import java.util.Scanner;

class program66_4
{
    public static long ToggleBit(long No,int Pos)
    {
        long Mask=1L<<(Pos-1);
        long Result=0;

        Result=No ^ Mask;

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

        iRet=ToggleBit(No,Pos);

        System.out.println("After Toggling the "+Pos+"th bit ,The decimal number is :"+iRet);

       

        sobj.close();


    }
}