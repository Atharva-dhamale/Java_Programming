
//Write a program to print each digit of a number separately

class Logic
{
    void printDigits(int num)
    {
       int iCnt=0;

       while(num>0)
       {
        iCnt=num%10;
        System.out.print(iCnt+" ");
        num=num/10;
       }
       System.out.println("");

       
    }
}
class program19_4
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.printDigits(9327);
    }
}