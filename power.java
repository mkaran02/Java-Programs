import java.util.Scanner;
public class power {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int x,y;
        int prod=1;          
        

        System.out.println("Enter Value of X: ");
        x=sc.nextInt();
       

        System.out.println("Enter Value of y(power): ");
        y=sc.nextInt();

     
        

            for (int i = 1; i <=y; i++) 
            {
                prod=prod*x;
                
            }

        
        System.out.println("x^y= " +prod);
        
        
    }
    
}
