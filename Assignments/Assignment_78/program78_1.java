import java.util.Scanner;

class program78_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int days=0;
        double bill=0.0;


        System.out.print("Enter number of days : ");
        days=sobj.nextInt();

        if(days<0)
        {
            System.out.println("Invalid input");
            return;
        }

        bill=days*3000;

        if(days>7)
        {
            bill=bill-(bill*0.05);
        }

        System.out.println("Total Stay Duration : "+days);
        System.out.println("Final Bill Amount : "+bill);



    }
}