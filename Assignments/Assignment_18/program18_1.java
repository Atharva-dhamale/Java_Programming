
//Write a program to check whether number is prime or not

class Logic
{
    void checkPrime(int num)
    {
        int iCnt=0;
        boolean isPrime=true;

        for(iCnt=2;iCnt<=num/2;iCnt++)
        {
            if((num%iCnt)==0)
            {
                isPrime=false;
                break;
            }
        }   
            if(isPrime)
            {
                System.out.println(num+" is a prime");
            }
            else
            {
                System.out.println(num+" is not a prime");
            }
        
    }    
}
class program18_1
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.checkPrime(11);
    }
}