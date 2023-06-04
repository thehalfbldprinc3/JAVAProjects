import java.util.Scanner;

public class Patterns
{
    public static void simpleSquare(int n)
    {
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=n)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void NumberRow(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++) System.out.print(i+1+" ");
            System.out.println();
        }
    }
    public static void NumberCols(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++) System.out.print(j+1+" ");
            System.out.println();
        }
    }
    public static void NumberRevCols(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>0;j--) System.out.print(j+" ");
            System.out.println();
        }
    }
    public static void SameNum(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++) System.out.print(n+" ");
            System.out.println();
        }
    }
    public static void TriangularNum(int n)
        {
            for(int i =0;i<n+1;i++)
            {
                for(int j=0;j<i;j++)
                {
                    System.out.print(j+1+" ");
                }
                System.out.println();
            }
        }
        public static void triangularNumCTD(int n)
        {
            int m=1;

            for (int i = 0; i <n+1; i++)
            {
                for (int j = 0; j <i; j++)
                {
                    System.out.print(m+" ");
                    m++;
                }
                System.out.println();
            }
        }
        public static void TriangularUneven(int n)
        {
            for(int i=0;i<n+1;i++)
            {
                int k=i;
                for(int j=0;j<i;j++)
                {

                    System.out.print(k+" ");
                    k++;
                }
                System.out.println();
            }
        }
        public static void  AlphaPattern(int n)
        {
            for(int i=0;i<n;i++)
            {
                char a=65;
                for(int j=0;j<n;j++)
                {
                    System.out.print(a+" ");
                    a++;
                }
                System.out.println();
            }
        }
    public static void  AlphaTriangularPattern(int n)
    {
        for(int i=0;i<n+1;i++)
        {
            char a=65;
            for(int j=0;j<i;j++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
    public static void sameAlphaTriangularPattern(int n)
    {
        for(int i=0;i<n+1;i++)
        {
            char a= (char) (i+64);
            for(int j=0;j<i;j++)
            {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
    public static void AlphaCTDSquare(int n)
    {
        for(int i=0;i<n;i++)
        {
            char k=(char)(i+65);
            for (int j = 0; j < n; j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void AlphaCTDTriangle(int n)
    {
        for(int i=0;i<n+1;i++)
        {
            char k=(char)(i+64);
            for (int j = 0; j < i; j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void revAlphaTriangularPattern(int n)
    {
        for(int i=0;i<n+1;i++)
        {
            char a=(char)(64+n);
            for(int j=0;j<i;j++)
            {
                System.out.print(a+" ");
                a--;
            }
            System.out.println();
        }
    }
    public static void interestingAlphabet(int n)
    {
        for(int i=0;i<n+1;i++)
        {
            char k=(char)(65+n-i);
            for(int j=0;j<i;j++)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
    public static void invertedTriangle(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertedNumberTriangle(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(n-i);
            }
            System.out.println();
        }
    }
    public static void MirrorTriangle(int n)
    {
        for(int i=0;i<n+2;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j<n+1)
                {
                    System.out.print(" ");
                }else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void MirrorNumberTriangle(int n)
    {
        for(int i=0;i<n+2;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j<n+1)
                {
                    System.out.print(" ");
                }else
                {
                    System.out.print(i-(n-j));
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        simpleSquare(n);
        System.out.println();
        NumberRow(n);
        System.out.println();
        NumberCols(n);
        System.out.println();
        NumberRevCols(n);
        System.out.println();
        SameNum(n);
        System.out.println();
        TriangularNum(n);
        System.out.println();
        triangularNumCTD(n);
        System.out.println();
        TriangularUneven(n);
        System.out.println();
        AlphaPattern(n);
        System.out.println();
        AlphaTriangularPattern(n);
        System.out.println();
        sameAlphaTriangularPattern(n);
        System.out.println();
        AlphaCTDSquare(n);
        System.out.println();
        AlphaCTDTriangle(n);
        System.out.println();
        revAlphaTriangularPattern(n);
        System.out.println();
        interestingAlphabet(n);
        System.out.println();
        invertedTriangle(n);
        System.out.println();
        invertedNumberTriangle(n);
        System.out.println();
        MirrorTriangle(n);
        System.out.println();
        MirrorNumberTriangle(n);
    }
}