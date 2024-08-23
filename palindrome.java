import java.util.Scanner;
class palindrome
{

    public static void main(String args[])
    {

      Scanner sc= new Scanner(System.in);
      int n, rev=0;
      int temp;
      System.out.println("Enter the no.");
      n=sc.nextInt();

     temp=n;

      while(n>0)
      {
           rev=(rev*10)+n%10;
           n=n/10;


      }
      if(rev==temp)
           System.out.println("Number is palindrome");
           else 
           System.out.println("Not Palindrome");

    }
}