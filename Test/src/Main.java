import java.util.*;
public class Main {


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n+1;i++)
        {
            int k=i;
            for(int j=i;j>0;j--)
            {
                System.out.print(k);
                k--;
            }
            System.out.println();
        }
    }

}
