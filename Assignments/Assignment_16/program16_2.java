
//Write a program to check whether a given number is even or odd

class Logic
{
    void checkEvenOdd(int n)
    {
        if((n%2)==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
    }
}
class program16_2
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.checkEvenOdd(7);
    }
}