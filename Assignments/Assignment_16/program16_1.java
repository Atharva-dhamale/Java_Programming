
//Write a program to calculate the sum of first N natural numbers

class Logic
{
    void calculatesum(int n)
    {
        int iCnt=0;
        int iSum=0;

        for(iCnt=1;iCnt<=n;iCnt++)
        {
            iSum=iSum+iCnt;
        }
        System.out.println("The Sum of the first "+n+" number is :"+iSum);
    }
}
class program16_1
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.calculatesum(10);
    }
}