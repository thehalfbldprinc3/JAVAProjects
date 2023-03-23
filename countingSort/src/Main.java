//Counting sort in java
import java.util.*;
class CountingSort
{
    void countSort(int[] array,int size) {
        int[] output = new int[size + 1];

        //Find the largest element of the array
        int max = array[0];
        for (int i = 1; i < size; i++) if (array[i] > max) max = array[i];
        int[] count = new int[max + 1];

        //initialize count array with all zeroes
        for (int i = 0; i < max; i++) count[i] = 0;

        //store the count of each element
        for (int i = 0; i < size; i++) count[array[i]]++;

        //store the cumulative count of each array
        for (int i = 1; i <= max; i++) count[i] += count[i - 1];

        /* find the index of each element of the original array in count and
           place the elements in output array */
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }
        //copy the sorted elements in the original array
        for (int i = 0; i < size; i++) array[i] = output[i];
    }
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
    System.out.println("enter the length of the array: ");
    int length = sc.nextInt();
    int[] array=new int[length];
    for(int i=0;i<length;i++)
    {
        System.out.println("enter the "+(i+1)+" element of the array: ");
        array[i]= sc.nextInt();
    }
    CountingSort cs=new CountingSort();
    cs.countSort(array,length);

    System.out.println("Sorted array int ascending order: ");
    System.out.println(Arrays.toString(array));
}
}