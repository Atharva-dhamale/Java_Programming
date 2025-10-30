
//Write a program to count total number of factor of a given number

class Logic
{
    void countFactors(int num)
    {
       int iCnt=0;
       int iFrequency=0;
       
       for(iCnt=1;iCnt<=num/2;iCnt++)
       {
        if((num%iCnt)==0)
        {
            iFrequency++;
        }
        
       }
       System.out.println(iFrequency);
    }
}
class program21_4
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.countFactors(20);
    }
}