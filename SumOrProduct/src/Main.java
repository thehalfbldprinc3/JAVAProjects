import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        int choice= sc.nextInt();

        if(choice==1)
        {
            System.out.println((n*(n+1)/2));
        } else if (choice==2)
        {
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact *=i;
            }
            System.out.println(fact);
        }else
        {
            System.out.println("-1");
        }
    }
}