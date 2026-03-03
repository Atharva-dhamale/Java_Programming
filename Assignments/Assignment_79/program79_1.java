
import java.util.Scanner;

class program79_1
{
    

    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int Students=0;
        int Subjects=0;
        int i=0;
        int j=0;
        int TotalMarks=0;
        int HighestMark=0;
        int Topper=0;
        float Average=0.0f;
        

        System.out.print("Enter number of Students : ");
        Students=sobj.nextInt();

        System.out.print("Enter number of Subjects : ");
        Subjects=sobj.nextInt();

        if((Students<=0) || (Subjects<=0))
        {
            System.out.println("Invalid input");
            return;
        }

        int Arr[][]=new int[Students][Subjects];

        for(i=0;i<Students;i++)
        {
            System.out.println("\nEnter Marks for Student "+(i+1)+" : ");
            for(j=0;j<Subjects;j++)
            {
                Arr[i][j]=sobj.nextInt();

                if((Arr[i][j]<0) || (Arr[i][j]>100))
                {
                    System.out.println("Please enter marks between 0 to 100");
                    return;
                }
                
            }
        }

        System.out.println("\nStudents Total Marks");

        for(j=0;j<Subjects;j++)
        {
            for(i=0,TotalMarks=0;i<Students;i++)
            {
                TotalMarks=TotalMarks+Arr[j][i];

                if(HighestMark<TotalMarks)
                {
                    HighestMark=TotalMarks;
                    Topper=j+1;
                }
                
            }
            System.out.println("Student "+(j+1)+" : "+TotalMarks);
            
        }

        System.out.println("\nTopper : Student "+Topper+" : "+HighestMark);


        System.out.println("\nSubject Average");
        for(i=0;i<Students;i++)
        {
            
            for(j=0;j<Subjects;j++)
            {
                Average=Average+Arr[i][j];
            }
            Average=Average/Subjects;
            System.out.println("Subject "+(i+1)+" : "+Average);
        }

        System.out.println("\nStudent Failed");
        for(j=0;j<Subjects;j++)
        {
            for(i=0,TotalMarks=0;i<Students;i++)
            {
                if(Arr[j][i]<35)
                {
                    System.out.println("Student "+(j+1));
                }
            }
            
            
        }
        

        sobj.close();
    }
}