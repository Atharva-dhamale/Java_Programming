
//Write a program to check whether a number is perfect number or not

class Logic
{
    void checkPerfect(int num)
    {
        int iCnt=0;
        int iAns=0;
        
        for(iCnt=1;iCnt<=num/2;iCnt++)
        {
            if((num%iCnt)==0)
            {
                iAns+=iCnt;
            }
        }
        if(iAns==num)
        {
            System.out.println(num+" is a perfect number");
        }
        else
        {
            System.out.println(num+" is not a perfect number");
        }
        
    
    }
}
class program20_3
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.checkPerfect(6);
    }
}