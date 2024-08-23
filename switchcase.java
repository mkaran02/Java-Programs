import java.util.Scanner;
class switchcase
{
    public static void main(String args[]){
     int a,b,ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The value of a:");
    a=sc.nextInt();
    System.out.println("Enter The value of b:");
    b=sc.nextInt();
    
    System.out.println("Enter Your choice 1->ADD 2->SUB 3->MULTI4->DIV");
    System.out.println("enter the choice:");
    ch=sc.nextInt();

    switch(ch)
    { 
        case 1:
            System.out.println("Addition:" +(a+b));



    }

}
}