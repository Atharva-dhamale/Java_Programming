import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

class program77_1
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int Days=0;
        int MedicineBill=0;
        int ConsultationFee=0;
        String WardType=null;
        String Insured=null;

        int RoomCharge=0;
        int Total=0;
        double InsBill=0.0;
        double InsCovered=0.0;

        System.out.print("Days :");
        Days=sobj.nextInt();

        System.out.print("Ward Type (Normal/ICU):");
        WardType=sobj.next();

        System.out.print("Medicine Bill :");
        MedicineBill=sobj.nextInt();

        System.out.print("Consultation Fee :");
        ConsultationFee=sobj.nextInt();

        System.out.print("Insured (Yes/No):");
        Insured=sobj.next();

        if((Days<=0) || (MedicineBill<0) || (ConsultationFee<0) || 
        (WardType.equalsIgnoreCase("Normal")==false) &
        (WardType.equalsIgnoreCase("ICU")==false) ||
        (Insured.equalsIgnoreCase("yes")==false) &&
        (Insured.equalsIgnoreCase("no")==false))
        
        {
            System.out.println("Invalid input");
            return;
        }

        if(WardType.equalsIgnoreCase("normal"))
        {
            RoomCharge=2000*Days;
        }
        else if(WardType.equalsIgnoreCase("ICU"))
        {
            RoomCharge=3000*Days;
        }

        Total=RoomCharge+MedicineBill+ConsultationFee;

        InsBill=Total*0.70;

        if(Insured.equalsIgnoreCase("yes") && (WardType.equalsIgnoreCase("Normal")))
        {
            if(50000>InsBill)
            {
                InsCovered=InsBill;
            }
            else if(50000<InsBill)
            {
                InsCovered=50000;
            }
        }

        else if(Insured.equalsIgnoreCase("yes") && (WardType.equalsIgnoreCase("icu")))
        {
            if(60000>InsBill)
            {
                InsCovered=InsBill;
            }
            else if(60000<InsBill)
            {
                InsCovered=60000;
            }
        }

        System.out.println("Total Bill : "+Total);
        System.out.println("Insurance Covered : "+InsCovered);
        System.out.println("Final Pay : "+(Total-InsCovered));



    }
}