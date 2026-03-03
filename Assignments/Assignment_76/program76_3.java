import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

class program76_3
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int Weight=0;
        int Rupees=0;
        

        System.out.print("Enter Parcel Weight : ");
        Weight=sobj.nextInt();

        if(Weight<=0)
        {
            System.out.println("Weight must be greater than 0");
            return;
        }

        if(Weight<=1)
        {
            Rupees=50;
        }
        else if(Weight>1 && Weight<=5)
        {
            Rupees=50+(Weight*20)-20;
        }
        else if(Weight>5)
        {
            Rupees=150+(Weight*30)-150;
        }

        System.out.println("Parcel Weight : "+Weight);
        System.out.println("Courier Charges : "+Rupees);
        

    }
}