import java.io.*;
import java.util.Scanner;

class starSquare
{
    static void printRectangle(int k,int l)
    {
        for(int a=1;a<=k;a++)
        {
            for(int b=1;b<=l;b++)
            {
                if(a==1||a==k||b==1||b==l) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int rows= sc.nextInt();
        System.out.println("enter the number of columns: ");
        int cols= sc.nextInt();

        printRectangle(rows,cols);
    }
}