
//Write a program to find the maximum of two numbers

class Logic
{
    void findMax(int a,int b)
    {
        if(a>b)
        {
            System.out.println(a+" is maximum");
        }
        else
        {
            System.out.println(b+" is maximum");
        }
    }    
}
class program17_3
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.findMax(20,15);
    }
}