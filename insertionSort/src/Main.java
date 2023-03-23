//Insertion sort in java.
import java.util.*;
class InsertionSort
{
    void insertionSort(int[] array)
    {
        int size = array.length;

        for(int step = 1 ; step < size ; step++)
        {
        int key = array[step];
        int j = step - 1;
            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j]
        while(j >= 0 && key < array[j])
        {
            array[j+1] = array[j];
            --j;
        }
            // Place key at after the element just smaller than it.
            array[j+1] = key;
        }
    }
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array: ");
    int length = sc.nextInt();
    int[] data = new int[length];

    for(int i = 0 ; i <= length-1; i++)
    {
        System.out.println("enter the "+(i+1)+" entry of the array");
        data[i]= sc.nextInt();
    }
    InsertionSort is=new InsertionSort();
    is.insertionSort(data);

    System.out.println("Sorted array in ascending order: ");
    System.out.println(Arrays.toString(data));
}
}