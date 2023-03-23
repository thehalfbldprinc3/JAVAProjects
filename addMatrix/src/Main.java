import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows of the first matrix: ");
        int rows1=sc.nextInt();
        System.out.println("enter the number of columns of the first matrix: ");
        int cols1= sc.nextInt();
        int[][] matrix1=new int[rows1][cols1];

        System.out.println("enter the number of rows of the second matrix: ");
        int rows2=sc.nextInt();
        System.out.println("enter the number of columns of the second matrix: ");
        int cols2= sc.nextInt();
        int[][] matrix2=new int[rows2][cols2];
        if(rows1==rows2&&cols1==cols2)
        {
            int[][] matrix3 = new int[rows1][cols1];

            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    System.out.println("enter the " + (i + 1) +     " entry of the 1st matrix: ");
                    matrix1[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < cols2; j++) {
                    System.out.println("enter the " + (i + 1) + " entry of the matrix: ");
                    matrix2[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    System.out.print(matrix3[i][j] + " ");
                }
                System.out.println();
            }
        }else System.out.println("Matrix addition Not possible(matrices do not have the same order)");
    }
}