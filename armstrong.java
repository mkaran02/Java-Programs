import java.util.Scanner;
class armstrong {

    public static void main(String args[])
    {

        int n, temp,count=0,digit , sum=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value of n:");
        n=sc.nextInt();
        temp=n;

        while(temp>0)
        {
            count=count+1;
            temp=temp/10;
        }
        System.out.println("No. of digits:" +count);

        temp=n; //again store value of n

        while(temp>0)  
        {
            digit=temp%10;  // used to get last digit
            int prod=1;

            for (int i = 1; i <= count; i++)  //used to find x^y
           { prod=prod*digit;

           
           }      
           sum=sum+prod;
           temp=temp/10;
            
        
            
            }
            if(sum==n)
            {
                System.out.println("armstrong");

            }
            else
            {
                System.out.println("Not armstrong");
            }
        
    
    }
    
}
