import java.util.Scanner;

class program67_2
{
    public static void CommonBits(long No1,long No2)
    {
        long Result=No1 & No2;
        int Pos=1;

        while(Result!=0)
        {
            if((Result & 1)==1)
            {
                System.out.print(Pos+" ");
            }
            Result=Result >> 1;
            Pos++;
        }
        System.out.println();
    }

    public static void main(String A[])
    {

        long No1=0,No2=0;

        Scanner sobj=new Scanner(System.in);

        System.out.print("Enter the number 1 : ");
        No1=sobj.nextLong();

        System.out.print("Enter the number 1 : ");
        No2=sobj.nextLong();

       
        CommonBits(No1,No2);

       

        sobj.close();


    }
}