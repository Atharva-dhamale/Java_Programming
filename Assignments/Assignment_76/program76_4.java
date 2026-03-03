import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

class program76_4
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int Budget=0;
        int Items=0;
        int i=0;
        int iCount=0;
        

        System.out.print("Enter Budget Amount : ");
        Budget=sobj.nextInt();

        System.out.print("Enter Number of items : ");
        Items=sobj.nextInt();

        

        if((Budget<=0) || (Items<=0))
        {
            System.out.println("Invalid input");
            return;
        }


        int Price[]=new int[Items];

        System.out.print("N items price : ");
        
        for(i=0;i<Items;i++)
        {
            Price[i]=sobj.nextInt();

            if(Price[i]<=0)
            {
                System.out.println("Invalid input");
            }

            if(Budget>=Price[i])
            {
                Budget=Budget-Price[i];
                iCount++;
            }
            else
            {
                break;
            }
        }

        System.out.println("Item purchased : "+iCount);
        System.out.println("Remaining Balance : "+Budget);

        
        

    }
}