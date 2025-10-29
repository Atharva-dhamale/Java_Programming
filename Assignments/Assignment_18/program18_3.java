
//Write a program to print all odd number upto n

class Logic
{
    void printOddNumber(int n)
    {
        int iCnt=0;
        

        for(iCnt=1;iCnt<=n;iCnt++)
        {
            if((iCnt%2)!=0)
            {
                System.out.print(iCnt+" ");
            }
            
        }   
        System.out.println("");
    }    
}
class program18_3
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.printOddNumber(20);
    }
}