import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a positive integer: ");
        int a = sc.nextInt();

        while(a>0)
        {
            if(a%2==0)
            {
                a=a/2;
                System.out.println(a);
            }else if(a%2!=0)
            {
                a=((3*a)+1);
                System.out.println(a);
            }
        }
    }
}