import java.util.Scanner;

class program80_3
{
    public static boolean checkPath(int Arr[][], int i, int j, int R, int C)
    {
        if(i >= R || j >= C)
        {
            return false;
        }

        
        if(Arr[i][j] == -1)
        {
            return false;
        }

        
        if(i == R-1 && j == C-1)
        {
            return true;
        }

        
        boolean right = checkPath(Arr, i, j+1, R, C);

        
        boolean down = checkPath(Arr, i+1, j, R, C);

        return right || down;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int R = 0;
        int C = 0;
        int i = 0;
        int j = 0;

        System.out.print("Enter Rows : ");
        R = sobj.nextInt();

        System.out.print("Enter Columns : ");
        C = sobj.nextInt();

        if(R <= 0 || C <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        int Arr[][] = new int[R][C];

        for(i = 0; i < R; i++)
        {
            System.out.println("\nEnter Row " + (i+1) + " : ");
            for(j = 0; j < C; j++)
            {
                Arr[i][j] = sobj.nextInt();

                if(Arr[i][j] != 0 && Arr[i][j] != -1)
                {
                    System.out.println("Values must be 0 or -1");
                    return;
                }
            }
        }

        
        if(Arr[0][0] == -1 || Arr[R-1][C-1] == -1)
        {
            System.out.println("No Path Found");
        }
        else
        {
            boolean result = checkPath(Arr, 0, 0, R, C);

            if(result)
            {
                System.out.println("Path Available");
            }
            else
            {
                System.out.println("No Path Found");
            }
        }

        sobj.close();
    }
}