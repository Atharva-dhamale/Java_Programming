import java.util.Scanner;

class program78_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int CallDuration=0;
        int Charge=0;

        System.out.print("Enter Minutes of Call Duration : ");
        CallDuration=sobj.nextInt();

        if(CallDuration<0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(CallDuration<=5)
        {
            Charge=0;
        }
        else if(CallDuration>5 && CallDuration<=15)
        {
            Charge=(CallDuration*1);
        }
        else if(CallDuration>15)
        {
            Charge=(CallDuration*2);
        }

        System.out.println("Call Duration : "+CallDuration);
        System.out.println("Total Call Charge : "+Charge);


    }
}