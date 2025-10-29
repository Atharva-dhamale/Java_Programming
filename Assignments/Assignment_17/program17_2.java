
//Write a program to check whether a number is a palindrome or not

class Logic
{
    void CheckPalindrome(int num)
    {
        int iNumber=num;
        int iReverseNum=0;
        int iCnt=0;
        

     while(num!=0)
     {
        iCnt=num%10;
        iReverseNum=iReverseNum*10+iCnt;

        
        num=num/10;
     }

      if(iNumber==iReverseNum)
      {
        System.out.println(iNumber+" is a palindrome");
      }
      else
      {
         System.out.println(iNumber+" is not a palindrome");
      }  
    }
}
class program17_2
{
    public static void main(String A[])
    {
        Logic obj=new Logic();
        obj.CheckPalindrome(121);
    }
}