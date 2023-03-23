import java.util.Scanner;

class MatrixFunctions
{
        int[][] matrixInput()
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int Rows= sc.nextInt();
            System.out.print("Enter the number of columns: ");
            int Cols=sc.nextInt();
            int[][] array =new int[Rows][Cols];

            for (int i = 0; i < Rows; i++)
            {
                for (int j = 0; j < Cols; j++)
                {
                    System.out.println("enter the "+(j+1)+"th entry of the "+(i+1)+"th row");
                      array[i][j]= sc.nextInt();
                }
            }
          return array;
        }
        int[][] matrixMultiplication(int[][] array1,int[][] array2)
        {
            int[][] array3=new int[Rows][Cols];
            return array3;
        }
}
public class Main {
    public static void main(String[] args)
    {
        MatrixFunctions MFn= new MatrixFunctions();
        int[][] array1 =MFn.matrixInput();
        int[][] array2 =MFn.matrixInput();

    }
}