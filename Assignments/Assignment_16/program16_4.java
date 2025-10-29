
//Write a program to reverse a number

class Logic
{
    void reverseNumber(int n)
    {
        int iCnt=0;
        

     while(n>0)
     {
        iCnt=n%10;
        System.out.print(iCnt);
        n=n/10;
     }

      System.out.println("");  
    }
}
class program16_4
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.reverseNumber(1234);
    }
}