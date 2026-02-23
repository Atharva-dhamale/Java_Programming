

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

    public void ReverseCol()
    {
        int i=0;
        int j=0;
        int left=0;
        int right=0;
        int temp=0;
        


        for(j=0;j<iCol;j++)
        {
           left=0;
           right=iRow-1;
           
           while(left<right)
           {
                temp=Arr[left][j];
                Arr[left][j]=Arr[right][j];
                Arr[right][j]=temp;

                left++;
                right--;
           }
           
        } 

        System.out.println("After Reverse the matrix is : ");
        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        
    }
}

class program73_3
{
    public static void main(String A[])
    {
        Matrix mobj=new Matrix(4,4);

        mobj.Accept();
        mobj.Display();

        mobj.ReverseCol();
    }
}
