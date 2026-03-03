import java.util.Scanner;

class program78_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int votes=0;
        int i=0;
        int j=0;
        int duplicate=0;
        int ValidVotes=0;

        System.out.print("Enter number of votes : ");
        votes=sobj.nextInt();

        int voterId[]=new int[votes];

        System.out.println("Enter voter id : ");

        for(i=0;i<votes;i++)
        {
            voterId[i]=sobj.nextInt();

            if(voterId[i]<=0)
            {
                System.out.println("Invalid input");
                return;
            }
        }

        ValidVotes=votes;

        for(i=0;i<votes;i++)
        {
            for(j=0;j<i;j++)
            {
                if(voterId[i]==voterId[j])
                {
                    duplicate++;
                    ValidVotes--;
                }
            }
            
            
        }

        System.out.println("Valid votes : "+ValidVotes);
        System.out.println("Rejected Duplicate Votes : "+duplicate);


    }
}