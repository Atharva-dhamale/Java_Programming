import java.util.Scanner;

class program77_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int rows = sobj.nextInt();

        System.out.print("Enter number of columns : ");
        int col = sobj.nextInt();

        int seats[][] = new int[rows][col];
        int rowPrice[] = new int[rows];       


        System.out.println("\nEnter price for each row:");
        for(int i = 0; i < rows; i++)
        {
            System.out.print("Price for row " + (i+1) + " : ");
            rowPrice[i] = sobj.nextInt();
        }

        
        System.out.print("\nEnter number of already booked seats: ");
        int bookedCount = sobj.nextInt();

        for(int i = 0; i < bookedCount; i++)
        {
            System.out.print("Enter booked seat position (row col): ");
            int r = sobj.nextInt() - 1;
            int c = sobj.nextInt() - 1;

            if(r >= 0 && r < rows && c >= 0 && c < col)
            {
                seats[r][c] = 1;
            }
        }

        
        System.out.print("\nEnter number of seats to book: ");
        int requested = sobj.nextInt();

        int reqRow[] = new int[requested];
        int reqCol[] = new int[requested];

        boolean available = true;
        int totalCost = 0;

        for(int i = 0; i < requested; i++)
        {
            System.out.print("Enter requested seat (row col): ");
            reqRow[i] = sobj.nextInt() - 1;
            reqCol[i] = sobj.nextInt() - 1;

            
            if(reqRow[i] < 0 || reqRow[i] >= rows || 
               reqCol[i] < 0 || reqCol[i] >= col ||
               seats[reqRow[i]][reqCol[i]] == 1)
            {
                available = false;
            }
        }

        if(available == false)
        {
            System.out.println("\nBooking Failed! Some seats are already booked or invalid.");
        }
        else
        {
            for(int i = 0; i < requested; i++)
            {
                totalCost += rowPrice[reqRow[i]];
                seats[reqRow[i]][reqCol[i]] = 1;
            }

            if(requested >= 6)
            {
                totalCost = totalCost - (totalCost * 10 / 100);
                System.out.println("\n10% Group Discount Applied!");
            }

            System.out.println("\nBooking Successful!");
            System.out.println("Total Cost : " + totalCost);
        }

        
        int remaining = 0;
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(seats[i][j] == 0)
                {
                    remaining++;
                }
            }
        }

        System.out.println("Remaining Seats : " + remaining);
    }
}