import java.util.Scanner;
public class prodofdig {


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
        int pro=1;
        while(i>0)
        {
            
            pro=pro*(i%10);
            i=i/10;
        }
        System.out.println("product is " +pro);
    }
}
