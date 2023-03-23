public class NumberSpiral
{
    public static void PrintSpiral(int size)
    {
        int rows=0,cols=0;

        int boundary=size-1;
        int sizeLeft=size-1;
        int flag=1;

        char move='r';

        int matrix[][]=new int[size][size];

        for(int i=1;i<size*size+1;i++)
        {
            matrix[rows][cols]=i;

        }
    }
}