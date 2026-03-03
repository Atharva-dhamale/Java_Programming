
import java.util.Scanner;

class program79_2
{
    

    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.print("Enter number of rows in theatre : ");
        int R=sobj.nextInt();

        System.out.print("Enter number of columns in theatre : ");
        int C=sobj.nextInt();

        if(R<=0 || C<=0)
        {
            System.out.println("Invalid input");
            return;
        }

        int Seats[][]=new int[R][C];
        int i=0,j=0;

        System.out.print("Enter Booking details (0/1)");


        for(i=0;i<R;i++)
        {
            System.out.println("Enter details of row : "+(i+1));

            for(j=0;j<C;j++)
            {
                Seats[i][j]=sobj.nextInt();

                if(Seats[i][j]!=0 && Seats[i][j]!=1)
                {
                    System.out.println("Invalid input");
                    return;
                }
            }
        }

        int TotalBooked=0;
        int MaxBookedInRow=0;
        int RowWithMax=0;
        int RowBooked=0;
        boolean FullRowExists=false;

        for(i=0;i<R;i++)
        {
            RowBooked=0;

            for(j=0;j<C;j++)
            {
                if(Seats[i][j]==1)
                {
                    TotalBooked++;
                }

                RowBooked=RowBooked+Seats[i][j];

                if(RowBooked>MaxBookedInRow)
                {
                    MaxBookedInRow=RowBooked;
                    RowWithMax=i;
                }

                if(RowBooked==C)
                {
                    FullRowExists=true;
                }
            }

            
        }

        System.out.println("Total Booked Seats : "+TotalBooked);
        System.out.println("Row with maximum booking : "+(RowWithMax+1));
        System.out.println("Full Row exists : "+(FullRowExists ? "Yes" : "NO"));

        System.out.println("Seat layout of theatre");

        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            {
                System.out.print("\t"+((Seats[i][j]==1) ?"Book":"Free"));
            }
            System.out.println();
        }



        sobj.close();
    }
}