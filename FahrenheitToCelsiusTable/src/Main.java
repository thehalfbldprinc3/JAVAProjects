public class Main
{
    public static void printFahrenheitTable(int start, int end, int step)
    {
        for(int i=start;i<=end;i+=step)
        {
            int C=((i-32)*5)/9;
            System.out.println(i+" "+C);
        }

    }
    public static void main(String[] args)
    {
        printFahrenheitTable(0,100,20);
    }
}