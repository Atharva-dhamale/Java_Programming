import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

class program75_5
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int Income=0;
        double Tax=0;

        System.out.print("Enter Annual Income : ");
        Income=sobj.nextInt();

        if(Income<0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(Income<=250000)
        {
            Tax=0;
        }
        else if(Income>=250000 && Income<=500000)
        {
            Tax=Income*0.05;
        }
        else if(Income>=500000 && Income<=1000000)
        {
            Tax=Income*0.20;
        }
        else if(Income>1000000)
        {
            Tax=Income*0.30;
        }

        System.out.println("Annual Income : "+Income);
        System.out.println("Total Tax Payable : "+Tax);



    }
}