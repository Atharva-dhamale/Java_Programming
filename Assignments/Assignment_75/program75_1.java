import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

class program75_1
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int Hours=0;
        int Rupees=0;

        System.out.print("Enter Total Parking Hours : ");
        Hours=sobj.nextInt();

        if(Hours<=0)
        {
            System.out.println("Invalid hours");
            return;
        }

        if(Hours<=2)
        {
            Rupees=20;
        }

        else if(Hours>2 && Hours<=10)
        {
            Rupees=20+(Hours*10)-20;
        }

        else if(Hours>10)
        {
            Rupees=20+((Hours*10)-20)+50;
        }

        System.out.println("Total Parking Duration : "+Hours);
        System.out.println("Total Parking Fee : "+Rupees);
    }
}