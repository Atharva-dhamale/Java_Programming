

import java.util.*;


class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];

    public Matrix(int a,int b)
    {
        this.iRow=a;
        this.iCol=b;

        Arr=new int[iRow][iCol];

    }

    public void Accept()
    {
        int i=0;
        int j=0;

        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the elements of the matrix : ");

        for(i=0;i<iRow;i++)
        {
            System.out.println("Enter the elemnts of row : "+(i+1));
            for(j=0;j<iCol;j++)
            {
                Arr[i][j]=sobj.nextInt();
            }
        }
        sobj.close();
    }

    public void Display()
    {
        int i=0;
        int j=0;
        
        System.out.println("Elements of the matrix are : ");

        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
        
    }

    public int FreqElement(int No)
    {
        int i=0;
        int j=0;
        int iCnt=0;

        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                if(Arr[i][j]==No)
                {
                   iCnt++;
                }
            }
        } 
        return iCnt;
    }
}

class program72_2
{
    public static void main(String A[])
    {
        Matrix mobj=new Matrix(4,4);
        int No=0;

        System.out.println("Enter number to search");

        Scanner sobj=new Scanner(System.in);
        No=sobj.nextInt();

        mobj.Accept();
        mobj.Display();

        System.out.println("Frequency of elements is : "+mobj.FreqElement(No));

        sobj.close();
    }
}
