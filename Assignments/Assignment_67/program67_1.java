import java.util.Scanner;

class program67_1
{
    public static int CountOne(long No)
    {
        int iCnt=0;

        while(No!=0)
        {
            if((No&1)==1)
            {
                iCnt++;
            }
            No=No >> 1;
        }

        return iCnt;
    }

    public static void main(String A[])
    {

        long No=0;
        long iRet=0;

        System.out.print("Enter the number : ");
        Scanner sobj=new Scanner(System.in);
        No=sobj.nextLong();

       
        iRet=CountOne(No);

        System.out.println("Count of bits ON is :"+iRet);

       

        sobj.close();


    }
}