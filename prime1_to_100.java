
import java.util.Scanner;

public class prime1_to_100
{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int i,j,count;

        for (i = 1; i <=100; i++) 
        {
            count=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                count=count+1;
                }        
            }
        if(count==2)
           {
            System.out.println(+i);

           }
            
        }

            
        }
    }
    

