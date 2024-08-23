import java.util.Scanner;

class fact 
{
    public static void main(String[] args) 
    {
        
        Scanner sc= new Scanner(System.in);
        int n,fact=1;
        System.out.println("Enter the value of n:");
        n=sc.nextInt();

        while(n>0)
        {
            fact=fact*n;
            n--;

        }
        System.out.println("Factorial is " +fact);
    }
}