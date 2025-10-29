
//Write a program to find the factorial of a number using for loop

class Logic
{
    void findFactorial(int n)
    {
        int iCnt=0;
        int iAns=0;
        iAns=1;

        for(iCnt=1;iCnt<=n;iCnt++)
        {
            iAns=iAns*iCnt;
        }

        System.out.println(iAns);
    }
}
class program16_3
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.findFactorial(5);
    }
}