
//Write a program to print all even number upto n

class Logic
{
    void printEvenNumber(int n)
    {
        int iCnt=0;
        

        for(iCnt=1;iCnt<=n;iCnt++)
        {
            if((iCnt%2)==0)
            {
                System.out.print(iCnt+" ");
            }
            
        }   
        System.out.println("");
    }    
}
class program18_2
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.printEvenNumber(20);
    }
}