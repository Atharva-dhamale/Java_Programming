import java.util.Scanner;

class program67_4
{
    public static boolean ChkBit(long No, int Pos1, int Pos2)
    {
        long Mask1 = 1L << (Pos1 - 1);
        long Mask2 = 1L << (Pos2 - 1);

        long Mask = Mask1 | Mask2;

        return ((No & Mask) != 0);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number: ");
        long No = sobj.nextLong();

        System.out.print("Enter first position: ");
        int Pos1 = sobj.nextInt();

        System.out.print("Enter second position: ");
        int Pos2 = sobj.nextInt();

        boolean bRet = ChkBit(No, Pos1, Pos2);

        if(bRet==true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

        sobj.close();
    }
}
