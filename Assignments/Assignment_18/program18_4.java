
//Write a program to find the sum of even and odd digits separetly in number

class Logic
{
    void sumEvenOddDigits(int num)
    {
        int iCnt=0;
        int iSum1=0;
        int iSum2=0;
        
        while(num>0)
        {
            iCnt=num%10;

            if((iCnt%2)==0)
            {
                iSum1=iSum1+iCnt;  
            }
            else
            {
                iSum2=iSum2+iCnt;
            }
            num=num/10;
            
        }
        System.out.println("Sum of even numbers "+iSum1);
        System.out.println("Sum of odd numbers "+iSum2);
    }    
}
class program18_4
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.sumEvenOddDigits(123456);
    }
}