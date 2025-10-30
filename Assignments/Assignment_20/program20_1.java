
//Write a program to find sum of all even numbers upto N

class Logic
{
    void sumEvenNumbers(int n)
    {
        int iCnt=0;
        int iAns=0;
        

        for(iCnt=1;iCnt<=n;iCnt++)
        {
            if((iCnt%2)==0)
            {
                iAns=iAns+iCnt;
            }
            
        }
        System.out.print(iAns);
        System.out.println("");
    }
}
class program20_1
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.sumEvenNumbers(10);
    }
}