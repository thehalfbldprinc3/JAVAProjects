//Shell sort in java
import java.util.*;

//shell sort
class ShellSort
{
    //Rearrange elements at each n/2,n/4,n/8,... intervals
    void shellSort(int[] array, int n)
    {
        for(int interval =n/2;interval>0;interval /= 2)
        {
            for(int i=interval;i<n;i++)
            {
                int temp = array[i];
                int j;
                for(j=i;j>=interval&&array[j-interval]>temp;j-=interval)
                {
                 array[j]=array[j-interval];
                }
                array[j]=temp;
            }
        }
    }

    //Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i =0;i<length;i++)
        {
            System.out.println("enter the " +(i+1)+" entry of the array: ");
            array[i]= sc.nextInt();
        }
        ShellSort ss = new ShellSort();
        ss.shellSort(array,length);

        System.out.println("Sorted array in Ascending order: ");
        System.out.println(Arrays.toString(array));
    }
}