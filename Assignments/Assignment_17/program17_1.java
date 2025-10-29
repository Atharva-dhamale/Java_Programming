
//Write a program to find sum of digits of number

class Logic
{
    void SumOfDigits(int n)
    {
        int iCnt=0;
        int iFrequency=0;
        

     while(n>0)
     {
        iCnt=n%10;
        iFrequency=iFrequency+iCnt;
        
        
        n=n/10;
     }

      System.out.println(iFrequency);  
    }
}
class program17_1
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.SumOfDigits(1234);
    }
}