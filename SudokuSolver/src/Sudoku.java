import java.util.*;
public class Sudoku
{
    static int N=9;
    static boolean solveSudoku(int[][] grid,int row,int cols)
    {
        if(row==N-1 && cols==N) return true;
        if(cols==N)
        {
            row++;
            cols=0;
        }
        if(grid[row][cols]!=0) return solveSudoku(grid,row,cols+1);

        for(int num=1;num<10;num++)
        {
            if(isSafe(grid,row,cols,num))
            {
                grid[row][cols]=num;

             if(solveSudoku(grid,row,cols+1)) return true;
            }
            grid[row][cols]=0;
        }
        return false;
    }
    static void print(int[][] grid)
    {
        for(int i=0; i<N;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(int[][] grid,int row,int cols,int num) {
        for (int x = 0; x <= 8; x++)
        {
            if (grid[row][x] == num)
            {
                return false;
            }
        }
        for (int x = 0; x <= 8; x++)
        {
            if (grid[x][cols] == num)
            {
                return false;
            }
        }
        int startRow=row-row%3,startCol=cols-cols%3;

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if(grid[i+startRow][j+startCol]==num)
                {
                    return false;
                }
            }
        }

      return true;
    }

    public static void main(String[] args)
    {
        int[][] grid =
        {       {0 ,0 ,3 ,0 ,0 ,0 ,0 ,0 ,6 },
                {0, 6, 0, 3, 2, 9, 0, 0, 0 },
                {9, 0, 8, 4, 0, 0, 0, 0, 3 },
                {0, 1, 0, 0, 0, 3, 0, 0, 0 },
                {0, 0, 9, 0, 0, 0, 0, 8, 0 },
                {0, 7, 0, 1, 9, 0, 0, 0, 2 },
                {0, 0, 0, 0, 0, 5, 7, 0, 0 },
                {4, 0, 0, 2, 0, 6, 0, 1, 0 },
                {0, 0, 0, 0, 0, 4, 9, 0, 5 }
        };

        if(solveSudoku(grid,0,0)) print(grid);
        else System.out.println("no Solution exists");
    }

}