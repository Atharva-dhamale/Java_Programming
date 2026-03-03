import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

class program75_4
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        String Helmet=null;
        String License=null;
        String OverSpeeding=null;
        int Fine=0;

        System.out.print("Helmet worn (Yes/No) : ");
        Helmet=sobj.next();

        System.out.print("License available (Yes/No) : ");
        License=sobj.next();

        System.out.print("Overspeeding (Yes/No) : ");
        OverSpeeding=sobj.next();

        if((Helmet.equalsIgnoreCase("yes")==false) &&
            (Helmet.equalsIgnoreCase("no")==false)  ||
            (License.equalsIgnoreCase("yes")==false) &&
            (License.equalsIgnoreCase("no")==false)  ||
            (OverSpeeding.equalsIgnoreCase("yes")==false) &&
            (OverSpeeding.equalsIgnoreCase("no")==false))

        {
            System.out.println("Invalid input");
            return;
        }
        

        if(Helmet.equalsIgnoreCase("no") && OverSpeeding.equalsIgnoreCase("no") && License.equalsIgnoreCase("no"))
        {
            Fine=3000;
        }
        else if(Helmet.equalsIgnoreCase("no") && License.equalsIgnoreCase("no"))
        {
            Fine=1500;
        }
        else if(Helmet.equalsIgnoreCase("no") && OverSpeeding.equalsIgnoreCase("no"))
        {
            Fine=2000;
        }
        else if(License.equalsIgnoreCase("no") && OverSpeeding.equalsIgnoreCase("no"))
        {
            Fine=2500;
        }
        
        else if(Helmet.equalsIgnoreCase("no"))
        {
            Fine=500;
        }
        else if(License.equalsIgnoreCase("no"))
        {
            Fine=1000;
        }
        else if(OverSpeeding.equalsIgnoreCase("no"))
        {
            Fine=1500;
        }
        

        System.out.println("Total Fine Amount : "+Fine);
        
        

        


    }
}