
//Write a program to calculate product of digits of a number

class Logic
{
    void productOfDigits(int num)
    {
       int iCnt=0;
       int iProduct=0;
       iProduct=1;
      

       while(num>0)
       {
        iCnt=num%10;
        iProduct*=iCnt;
        num=num/10;
       }
       System.out.println(iProduct+" ");
       

       
    }
}
class program21_1
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.productOfDigits(234);
    }
}