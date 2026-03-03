import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

class program76_5
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int Percentage=0;

        System.out.print("Enter Battery Percentage : ");
        Percentage=sobj.nextInt();

        if(Percentage<0 || Percentage>100)
        {
            System.out.println("Invalid battey percentage");
            return;
        }

        if(Percentage<=5)
        {
            System.out.println("Battery Percentage : "+Percentage);
            System.out.println("Status : Critical");
        }
        else if(Percentage<=15)
        {
            System.out.println("Battery Percentage : "+Percentage);
            System.out.println("Status : Low");
        }
        else
        {
            System.out.println("Battery Percentage : "+Percentage);
            System.out.println("Status : Normal");
        }
      

    }
}