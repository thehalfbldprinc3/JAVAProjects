//radix sort in java
import java.util.*;
class RadixSort
{
    void countingSort(int[] array,int size,int place)
    {
        int[] output = new int[size+1];
        int max = array[0];
        for(int i =1;i<size;i++)
        {
            if(array[i]>max) max = array[i];
        }
        int[] count = new int[max+1];

        for(int i =0;i<max;i++) count[i]=0;

        //calculate the count of elements
        for(int i =0;i<size;i++)
            count[(array[i]/place)%10]++;

        //calculate cumulative count
        for(int i =1;i<10;i++)
            count[i]+=count[i-1];

        //place the elements in sorted order
        for(int i = size-1;i>=0;i--)
        {
            output[count[(array[i]/place)%10]-1]=array[i];
            count[(array[i]/place)%10]--;
        }
        for(int i =0;i<size;i++) array[i]=output[i];
    }
    //function to get the largest element from an array
    int getMax(int[] array, int n)
    {
        int max=array[0];
        for(int i = 1;i<n;i++)
            if(array[i]>max) max = array[i];
        return max;
    }

    //main function to implement radix sort
    void radixSort(int[] array,int size)
    {
        //get maximum element
        int max = getMax(array,size);

        //apply counting sort to sort elements based in place value
        for(int place =1;max/place>0;place*=10)
            countingSort(array,size,place);
    }

    //Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array: ");
        int length = sc.nextInt();
        int[] array1 = new int[length];
        for(int i =0;i<length;i++)
        {
            System.out.println("enter the "+(i+1)+" element of the array: ");
            array1[i]= sc.nextInt();
        }
        RadixSort rs = new RadixSort();
        rs.radixSort(array1,length);

        System.out.println("Sorted array in ascending order: ");
        System.out.println(Arrays.toString(array1));
    }
}