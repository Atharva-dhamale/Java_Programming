
import java.util.Scanner;

class program80_2
{
    

    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int R=0;
        int C=0;
        int i=0;
        int j=0;
        int sum=0;
        int RowSum=0;
        int ColSum=0;
        int diag1=0;
        int diag2=0;
        boolean magic=false;

        System.out.println("Enter number of rows : ");  
        R=sobj.nextInt(); 
        
        System.out.println("Enter number of columns : ");  
        C=sobj.nextInt(); 


        int Arr[][]=new int[R][C];

        if(R<=0 || C<=0)
        {
            System.out.println("Invalid input : No. of rows and columns must be non negative");
            return;
        }
        if(R!=C)
        {
            System.out.println("Invalid input : No. of rows and columns should be same");
            return;
        }



        for(i=0;i<R;i++)
        {
            System.out.println("\nEnter Row "+(i+1)+" : ");
            for(j=0;j<C;j++)
            {
                Arr[i][j]=sobj.nextInt();
            }
        }

        for(j=0;j<C;j++)
        {
            sum=sum+Arr[0][j];
        }

        magic=true;


        for(i=0;i<R;i++)
        {
            RowSum=0;
            for(j=0;j<C;j++)
            {
                RowSum=RowSum+Arr[i][j];
            }
            if(RowSum!=sum)
            {
                magic=false;
                break;
            }
        }


        for(j=0;j<C;j++)
        {
            ColSum=0;
            for(i=0;i<C;i++)
            {

                ColSum=ColSum+Arr[j][i];
            }
            if(ColSum!=sum)
            {
                magic=false;
                break;
            }
        }

        for(i=0;i<R;i++)
        {
            diag1=diag1+Arr[i][i];
            diag2=diag2+Arr[i][R-1-i];
        }

        if(diag1!=sum ||diag2!=sum)
        {
            magic=false;
        }

        if(magic==true)
        {
            System.out.println("Matrix is a magic square");
        }
        else
        {
            System.out.println("Matrix is NOT a magic square");
        }

        sobj.close();
    }
}