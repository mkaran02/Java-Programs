import java.util.Scanner;
/**
 * sumofdig
 */
 class sumofdig {

    public static void main(String args[])
    {
        demo aa = new demo();
        aa.getdata();
        aa.putdata();

    }
}
class demo
{
    int i;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        i=sc.nextInt();

        

    }
    void putdata()
    {
        int sum=0;
        while(i>0)
        {
            
            sum=sum+i%10;
            i=i/10;
        }
        System.out.println("Sum is" +sum);
    }
}
