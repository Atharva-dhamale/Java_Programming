
//Write a program to count number of digits in given number

class Logic
{
    void countDigits(int n)
    {
        int iCnt=0;
        int iFrequency=0;
        

     while(n>0)
     {
        iCnt=n%10;
        iFrequency++;
        
        n=n/10;
     }

      System.out.println(iFrequency);  
    }
}
class program16_5
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.countDigits(7865);
    }
}