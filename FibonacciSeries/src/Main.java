import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        int Terms=sc.nextInt();
        int Proxy;
        int c=0;
        for(int i=0;i<Terms;i++)
        {
            System.out.print(c+ " ");
            c=a+b;
            Proxy=b;
            b=c;
            a=Proxy;
        }
    }
}