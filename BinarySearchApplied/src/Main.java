import java.util.*;

public class Main
{
    public int Search(int[][] matrix,int key)
    {
        int top=matrix.length;
        int down=matrix[0].length;
        boolean found=false;
        while(found=false)
        {
            for(int i=0)
            {

            }
        }


        return 0;
    }
    public static void main(String[] args)
    {
        int rows,cols;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        rows =sc.nextInt();
        System.out.println("enter the number of columns: ");
        cols=sc.nextInt();
        int[][] matrix=new int[rows][cols];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.println("enter the "+i+1+"element of the "+j+1+" row");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the element to searched");
    }
}