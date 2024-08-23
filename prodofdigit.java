import java.util.Scanner;

class productofdig
{
    public static void main(String args[])
    {
        int n;
        int prod=1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        
        while(n>0) 
        {
              prod=prod*(n%10);
              n=n/10;
        }

        System.out.println("Product of digits is " +prod);
}
}