
//Write a program to display all factors of a given number

class Logic
{
    void displayFactors(int num)
    {
       int iCnt=0;
       
       for(iCnt=1;iCnt<=num/2;iCnt++)
       {
        if((num%iCnt)==0)
        {
            System.out.print(iCnt+" ");
        }
        
       }
       System.out.println();
    }
}
class program21_3
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.displayFactors(12);
    }
}