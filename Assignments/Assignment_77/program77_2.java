import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

class program77_2
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int Distance=0;
        String ClassType=null;
        int BookingHours=0;
        int age=0;
        double Fare=0.0;
        double FareScenior=0.0;
        String Reason=null;

        System.out.print("Enter distance : ");
        Distance=sobj.nextInt();

        System.out.print("Enter Class type (Sleeper/2AC/3AC): ");
        ClassType=sobj.next();

        System.out.print("Enter Booking Hours : ");
        BookingHours=sobj.nextInt();

        System.out.print("Enter Age : ");
        age=sobj.nextInt();

        if(Distance<0)
        {
            System.out.println("Invalid Distance");
            return;
        }

        if(ClassType.equalsIgnoreCase("sleeper"))
        {
            if(age>=1 && age<=70)
            {
                if(BookingHours<=24)
                {
                    Fare=Distance*10;
                    Fare=(Fare*0.30)+Fare;

                    Reason="Sleeper Class :Age is below 70";
                }
            }
            else if(age>70 && age<=100)
            {
                if(BookingHours<=24)
                {
                    Fare=Distance*10;
                    Fare=(Fare*0.30)+Fare;
                    FareScenior=(Fare*0.40);
                    Fare=Fare-FareScenior;

                    Reason="Sleeper Class :Age is above 70";
                }
            }  
        }


        else if(ClassType.equalsIgnoreCase("2AC"))
        {
            if(age>=1 && age<=70)
            {
                if(BookingHours<=24)
                {
                    Fare=Distance*20;
                    Fare=(Fare*0.30)+Fare;

                    Reason="2AC Class :Age is below 70";
                }
            }
            else if(age>70 && age<=100)
            {
                if(BookingHours<=24)
                {
                    Fare=Distance*20;
                    Fare=(Fare*0.30)+Fare;
                    FareScenior=(Fare*0.40);
                    Fare=Fare-FareScenior;

                    Reason="2AC Class :Age is above 70";
                }
            }  
        }

        else if(ClassType.equalsIgnoreCase("3AC"))
        {
            if(age>=1 && age<=70)
            {
                if(BookingHours<=24)
                {
                    Fare=Distance*30;
                    Fare=(Fare*0.30)+Fare;

                    Reason="3AC Class :Age is below 70";
                }
            }
            else if(age>70 && age<=100)
            {
                if(BookingHours<=24)
                {
                    Fare=Distance*30;
                    Fare=(Fare*0.30)+Fare;
                    FareScenior=(Fare*0.40);
                    Fare=Fare-FareScenior;

                    Reason="3AC Class :Age is above 70";
                }
            }  
        }

        System.out.println("Final Fare : "+Fare);
        System.out.println(Reason);


    }
}