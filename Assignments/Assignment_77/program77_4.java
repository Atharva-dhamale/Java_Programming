import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

class program77_4
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int units=0;
        int weeksLate=0;
        double Bill=0.0;
        
        
        System.out.print("Enter units : ");
        units=sobj.nextInt();

        System.out.print("Enter Weeks Late : ");
        weeksLate=sobj.nextInt();

        if(units>0 && units<=20)
        {
            Bill=(units*5);

            if(weeksLate==1)
            {
                Bill=(Bill*0.02)+Bill;
            }
            else if(weeksLate==2)
            {
                Bill=(Bill*0.04)+Bill;
            }
            else if(weeksLate==3)
            {
                Bill=(Bill*0.06)+Bill;
            }
            else if(weeksLate==4)
            {
                Bill=(Bill*0.08)+Bill;
            }
            else if(weeksLate==5)
            {
                Bill=(Bill*0.10)+Bill;
            }

        }

        else if(units>20 && units<=40)
        {
            Bill=(units*10);

            if(weeksLate==1)
            {
                Bill=(Bill*0.02)+Bill;
            }
            else if(weeksLate==2)
            {
                Bill=(Bill*0.04)+Bill;
            }
            else if(weeksLate==3)
            {
                Bill=(Bill*0.06)+Bill;
            }
            else if(weeksLate==4)
            {
                Bill=(Bill*0.08)+Bill;
            }
            else if(weeksLate==5)
            {
                Bill=(Bill*0.10)+Bill;
            }

        }


        System.out.println("Total Bill Amount : "+Bill);


    }
}