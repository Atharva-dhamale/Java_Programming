
//Write a program to print multiplication table of number

class Logic
{
    void printTable(int num)
    {
        int iCnt=0;
        int iFrequency=0;

        for(iCnt=1;iCnt<=num;iCnt++)
        {
            iFrequency=num*iCnt;
            System.out.print(iFrequency+" ");
            
        }
        System.out.println("");
    }    
}
class program17_5
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.printTable(5);
    }
}