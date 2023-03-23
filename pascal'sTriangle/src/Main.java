import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        float noRows,c=1,blkc,i,j;
        System.out.println("Input the number of rows: ");
        noRows= sc.nextFloat();

        for(i=0;i<noRows;i++)
        {
            for(blkc=1;blkc<=noRows-i;blkc++) System.out.print(" ");
            for(j = 0 ; j <= i ; j++)
            {
                if(j == 0 || i == 0) c=1;
                else c=c*(i-j+1)/j;

                System.out.print("   " + c);
            }
            System.out.println();
        }
    }
}