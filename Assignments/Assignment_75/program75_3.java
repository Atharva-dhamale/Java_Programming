import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

class program75_3
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int CurrentStock=0;
        int ReqStock=0;

        System.out.print("Enter the current stock : ");
        CurrentStock=sobj.nextInt();

        System.out.print("Enter the Requested stock : ");
        ReqStock=sobj.nextInt();

        if(CurrentStock<0 || ReqStock<=0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(ReqStock>CurrentStock)
        {
            System.out.println("Order fails : Insufficient stock");
            return;
        }
        else
        {
            CurrentStock=CurrentStock-ReqStock;
        }

        if(CurrentStock<5)
        {
            System.out.println("Low Stock Alert");
        }
        else
        {
            System.out.println("Order Processed Succesfully");
            System.out.println("Remaining stock is : "+CurrentStock);
        }



    }
}