import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int num=0;
        for(int i=1;;i++)
        {
            if(((3*i)+2)%4!=0)
            {
                System.out.println(((3*i)+2)+" ");
                num++;
                if(num==N)
                {
                    break;
                }
            }

        }
    }
}