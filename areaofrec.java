import java.util.Scanner;
class areaofrec{
   public static void main(String args[])
   {
        int length,breadth,area;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of rectangle is");
        length=sc.nextInt();
        System.out.println("Enter breadth of rectangle is");
        breadth=sc.nextInt();
        area=length*breadth;
        System.out.println("Area of rectangle is" +area);
        

   }



}