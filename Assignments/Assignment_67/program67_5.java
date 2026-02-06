import java.util.Scanner;

class program67_5
{
    public static long ToggleBitRange(long No, int iStart, int iEnd)
    {
        long Mask1 = (1L << iEnd) - 1;
        long Mask2 = (1L << (iStart - 1)) - 1;

        long Mask = Mask1 ^ Mask2;

        return No ^ Mask;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number: ");
        long No = sobj.nextLong();

        System.out.print("Enter start position: ");
        int iStart = sobj.nextInt();

        System.out.print("Enter end position: ");
        int iEnd = sobj.nextInt();

        long Result = ToggleBitRange(No, iStart, iEnd);

        System.out.println("Modified number: " + Result);

        sobj.close();
    }
}
