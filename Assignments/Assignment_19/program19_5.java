
//Write a program to calculate the power of a number using loops

class Logic
{
    void calculatePower(int base,int exp)
    {
        int iCnt=0;
        int iAns=0;
        iAns=1;

        for(iCnt=1;iCnt<=exp;iCnt++)
        {
            iAns=iAns*base;
        }
        System.out.print(iAns);
        System.out.println("");
    }
}
class program19_5
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.calculatePower(2,5);
    }
}