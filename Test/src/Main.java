import java.util.*;
public class Main
{
        public static void main(String[] args)
        {
                Scanner sc=new Scanner(System.in);
                int N=sc.nextInt();

                for(int i=2;i<=N;i++)
                {
                        boolean flag=false;
                        for(int j=2;j<i;j++)
                        {
                                if (i % j == 0)
                                {
                                        flag=true;
                                        break;
                                }
                        }
                        if(!flag) System.out.println(i);
                }
                System.out.println(N);

        }
}