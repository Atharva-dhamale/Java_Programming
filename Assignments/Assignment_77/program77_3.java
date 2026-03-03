import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

class program77_3
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int mins=0;
        int gb=0;
        int sms=0;
        char plan='\0';
        int total=0;
        int totalCost=0;
        
        System.out.print("Enter mins : ");
        mins=sobj.nextInt();

        System.out.print("Enter gb : ");
        gb=sobj.nextInt();

        System.out.print("Enter sms : ");
        sms=sobj.nextInt();

        total=mins+gb+sms;

        if(total<=201)
        {
            plan='A';
            totalCost=99;

            if(mins>100)
            {
                totalCost=totalCost+(mins*1)-totalCost;
            }
            if(gb>1)
            {
                totalCost=totalCost+(gb*15);
            }
            if(sms>100)
            {
                totalCost=totalCost+(sms*1);
            }
        }

        else if(total<=302)
        {
            plan='B';
            totalCost=199;

            if(mins>200)
            {
                totalCost=totalCost+(mins*1)-totalCost;
            }
            if(gb>2)
            {
                totalCost=totalCost+(gb*15);
            }
            if(sms>100)
            {
                totalCost=totalCost+(sms*1);
            }
        }

        else if(total<=403)
        {
            plan='C';
            totalCost=299;

            if(mins>300)
            {
                totalCost=totalCost+(mins*1)-totalCost;
            }
            if(gb>3)
            {
                totalCost=totalCost+(gb*15);
            }
            if(sms>100)
            {
                totalCost=totalCost+(sms*1);
            }
        }

        else
        {
            plan='D';
            totalCost=399;

            if(mins>400)
            {
                totalCost=totalCost+(mins*1)-totalCost;
            }
            if(gb>4)
            {
                totalCost=totalCost+(gb*15);
            }
            if(sms>100)
            {
                totalCost=totalCost+(sms*1);
            }
        }

    
        

        System.out.println("Recommended plan : "+plan);
        System.out.println("Total Cost : "+totalCost);

        

    }
}