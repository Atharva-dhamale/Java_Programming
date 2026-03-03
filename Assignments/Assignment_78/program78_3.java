import java.util.Scanner;

class program78_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

       int steps[]=new int[7];
       int i=0;
       int goal=0;
       int iCnt=0;
       int highestStep=0;

       System.out.println("Enter steps of 7 days : ");

       for(i=0;i<steps.length;i++)
        {
            steps[i]=sobj.nextInt();

            if(steps[i]<0)
            {
                System.out.println("Invalid input");
                return;
            }
        }

        goal=2000;

        for(i=0;i<steps.length;i++)
        {
            if(steps[i]>=goal)
            {
                iCnt++;
            }
            if(highestStep<steps[i])
            {
                highestStep=steps[i];
            }
        }

        System.out.println("Goal Acheived days : "+iCnt);
        System.out.println("Maximum Steps in week : "+highestStep);




    }
}