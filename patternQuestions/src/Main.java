class Patterns
{
    public void rightTri(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
            System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void leftTri(int n)
    {
        for(int a=0;a<=n;a++)
        {
            for(int b=2*(n-a);b>=0;b--)
            {
                System.out.print(" ");
            }
            for (int b=0;b<=a;b++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void revPyramid(int n)
    {
        int i, j;
        for (i = n; i >= 1; i--) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Patterns p=new Patterns();
        p.rightTri(4);
        System.out.println();
        p.leftTri(4);
        System.out.println();
        p.revPyramid(4);
    }
}