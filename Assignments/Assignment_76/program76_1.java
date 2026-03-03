import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

class program76_1
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int Distance=0;
        String Peak=null;
        double Fare=0;

        System.out.print("Enter Distance in km : ");
        Distance=sobj.nextInt();

        System.out.print("Enter Peak Hour (Yes/No) : ");
        Peak=sobj.next();

        if(Distance<=0)
        {
            System.out.println("Invalid Distance");
            return;
        }

        if(Distance<=10)
        {
            Fare=50+(Distance*12);
        }
        else if(Distance>10)
        {
            Fare=50+(Distance*15);
        }

        if(Peak.equalsIgnoreCase("yes"))
        {
            Fare=(Fare*0.20)+Fare;
        }

        System.out.println("Distance : "+Distance+" km");
        System.out.println("Peak Hour : "+Peak);
        System.out.println("Total Fare : "+Fare);

    }
}