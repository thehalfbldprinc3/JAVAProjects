import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int reverse=0,remainder;
        while(a!=0)
        {
            remainder=a%10;
            reverse=reverse*10+remainder;
            a/=10;
        }
        System.out.println(reverse);
    }
}