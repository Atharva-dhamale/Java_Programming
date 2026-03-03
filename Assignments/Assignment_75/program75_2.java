import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

class program75_2
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int Age=0;
        int Income=0;
        int CreditScore=0;
        String ExistingLoan=null;

        System.out.print("Enter Age : ");
        Age=sobj.nextInt();

        System.out.print("Enter Monthly Income : ");
        Income=sobj.nextInt();

        System.out.print("Enter Credit Score : ");
        CreditScore=sobj.nextInt();

        System.out.print("Enter Existing unpaid Loan : ");
        ExistingLoan=sobj.next();

        if((Age <= 0) || (Income <=0) || (CreditScore <=0) ||
        (ExistingLoan.equalsIgnoreCase("Yes")==false) &&
        (ExistingLoan.equalsIgnoreCase("No")==false))
        {
            System.out.println("Invalid input");
            return;
        }

        if(Age>=21 && Age<=60)
        {
            if(Income>=25000)
            {
                if(CreditScore>=700)
                {
                    if(ExistingLoan.equalsIgnoreCase("no"))
                    {
                        System.out.println("Loan Approved");
                    }
                    else
                    {
                        System.out.println("Loan Rejected : Because of Existing unpaid Loan");
                    }
                }
                else
                {
                    System.out.println("Loan Rejected : Because of Credit Score is less than 700");
                }
            }
            else
            {
                System.out.println("Loan Rejected : Because of Monthly income is less than 25000");
            }
        }
        else
        {
            System.out.println("Loan Rejected : Because of Age is not between 21 to 60");
        }

    }
}