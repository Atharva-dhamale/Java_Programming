
//Write a program to find largest digit in given number

class Logic
{
    void findLargestDigit(int num)
    {
       int iCnt=0;
       int largestNum=0;

       while(num>0)
       {
        iCnt=num%10;
        if(iCnt>largestNum)
        {
            largestNum=iCnt;
        }
        num=num/10;
       }
       System.out.println(largestNum);

       
    }
}
class program20_4
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.findLargestDigit(83429);
    }
}