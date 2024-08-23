//Write a java program to find sum of first N Natural numbers
import java.util.Scanner;
class sum
{
    public static void main(String[] args) {
        
    
    int i=0,n;
    int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of n:");
    n=sc.nextInt();

    while(n>0)
    {
        sum=sum+n%10;
        n=n/10;

       
    }
    System.out.println("SUM is " +sum);
}
}