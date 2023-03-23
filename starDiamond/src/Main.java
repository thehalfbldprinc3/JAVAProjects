import java.io.*;
import java.util.*;
class starDiamond
{
    private static void displayUpperPart(int size)
    {
            int m,n;
            for(m=size;m>=0;m--)
            {
                for(n=0;n<m;n++)
                {
                    System.out.print(" ");
                }
                for (n=m;n<size;n++)
                {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
    }
    private static void displayLowerPart(int size)
    {
            int m,n;
            for(m=1;m<=size;m++)
            {
                for(n=1;n<m;n++)
                {
                    System.out.print(" ");
                }
                for (n=m;n<=size;n++)
                {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length of the star");
        int size= sc.nextInt();

        displayUpperPart(size);
        displayLowerPart(size);
    }
}
