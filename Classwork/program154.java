//Input: 5
//Output: 1 2 3 4 5

import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt=0;

        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            if((iCnt%2)!=0)
            {

                System.out.print(iCnt+"\t");
            }
            else
            {
                System.out.print("*\t");
            }
        }
        System.out.println();
    }
}

class program154
{
    public static void main(String A[])
    {
        int iValue=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the frequency :");
        iValue=sobj.nextInt();

        Pattern pobj=new Pattern();
        pobj.Display(iValue);
    }
}