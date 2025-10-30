
//Write a program to check whether the given year is leap year or not

class Logic
{
    void checkLeapYear(int year)
    {
        if(((year%4)==0)||((year%400)==0)&&((year%100)!=0))
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
    }
}
class program19_1
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.checkLeapYear(2024);
    }
}