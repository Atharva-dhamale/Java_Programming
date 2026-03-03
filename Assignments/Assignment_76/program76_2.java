import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

class program76_2
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int MarksPercent=0;
        int AttendancePercent=0;
        int FamilyIncome=0;

        System.out.print("Marks Percent : ");
        MarksPercent=sobj.nextInt();

        System.out.print("Attendance Percent : ");
        AttendancePercent=sobj.nextInt();

        System.out.print("Family Income : ");
        FamilyIncome=sobj.nextInt();

        if(!(MarksPercent>=0 && MarksPercent<=100))
        {
            System.out.println("Invalid Marks Percent");
            return;
        }
        else if(!(AttendancePercent>=0 && AttendancePercent<=100))
        {
            System.out.println("Invalid Attendance Percent");
            return;
        }
        else if(FamilyIncome<=0)
        {
            System.out.println("Family income must no be negative and zero");
            return;
        }

        if(MarksPercent>=80)
        {
            if(AttendancePercent>=75)
            {
                if(FamilyIncome<=300000)
                {
                    System.out.println("Scholarship Approved");
                }
                else
                {
                    System.out.println("Scholarship Rejected : Because of Family income is greater than 300000");
                }
            }
            else
            {
                System.out.println("Scholarship Rejected : Because of Attendance percent is less than 75");
            }
        }
        else
        {
            System.out.println("Scholarship Rejected : Because of Marks percent is less than 80");
        }
        

    }
}