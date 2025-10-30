
//Write a program to display the grade of a student based on marks

class Logic
{
    void displayGrades(int marks)
    {
        if((marks<100)&&(marks>90))
        {
            System.out.println("O Grade");
        }
        else if((marks<90)&&(marks>80))
        {
            System.out.println("A Grade");
        }
        else if((marks<80)&&(marks>70))
        {
           System.out.println("B Grade"); 
        }
        else if((marks<70)&&(marks>60))
        {
            System.out.println("C Grade");
        }
        else if((marks<60)&&(marks>50))
        {
           System.out.println("D Grade"); 
        }
    }
}
class program19_2
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.displayGrades(82);
    }
}