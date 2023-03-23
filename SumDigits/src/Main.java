import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int n;
        while(a>0)
        {
            n=a%10;
            sum=sum+n;
            a=a/10;
        }
        System.out.println(sum);
    }
}