
//Write a program to count how many even and odd numbers are present between 1 and N

class Logic
{
    void countEvenOddRange(int n)
    {
       int iCnt=0;
       int iFrequency1=0;
       int iFrequency2=0;
      
       for(iCnt=1;iCnt<=n;iCnt++)
       {
        if((iCnt%2)==0)
        {
            iFrequency1++;
        }
        else
        {
            iFrequency2++;
        }
       }

       System.out.println("Even count between 1 to "+n+" is "+iFrequency1);
       System.out.println("Odd count between 1 to "+n+" is "+iFrequency2);
    }
}
class program21_2
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.countEvenOddRange(50);
    }
}