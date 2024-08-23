import java.util.Scanner;

class table
{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n,temp;
        System.out.println("Enter the value of n:");
        n=sc.nextInt();

        for (int i = 1; i <= 10; i++) 
        {
            temp=n*i;
            System.out.println(temp);
        }
         


    }
}