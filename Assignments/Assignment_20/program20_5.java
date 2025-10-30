
//Write a program to find smallest digit in given number

class Logic
{
    void findSmallestDigit(int num)
    {
       int iCnt=0;
       int SmallestNum=10;

       while(num>0)
       {
        iCnt=num%10;
        if(iCnt<SmallestNum)
        {
            SmallestNum=iCnt;
        }
        num=num/10;
       }
       System.out.println(SmallestNum);

       
    }
}
class program20_5
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.findSmallestDigit(9327);
    }
}