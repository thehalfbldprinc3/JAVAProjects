//Quick sort in java.
import java.util.*;
class Quicksort
{
    //method to find the partition position
    static int partition(int[] array,int low,int high)
    {
        //choose the rightmost element as pivot
        int pivot = array[high];

        //pointer for greatest element
        int i = (low-1);

        //traverse through all elements
        //compare each elemet with pivot
        for(int j=low; j<high;j++){
            if(array[j]<=pivot) {
                //if element smaller than the pivot is found
                //swap it with the greater element pointed bu i
                i++;

                //swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j]=temp;
            }
        }
        //swap the pivot element with the greatest element specified by i
        int temp = array[i+1];
        array[i+1]=array[high];
        array[high]= temp;

        //return the position from where partition is done
        return (i+1);
    }
    static void quickSort(int array[],int low,int high)
    {
        if(low <high)
        {
        //find pivot element such that
        //elements smaller than the pivot are on the left
        //elements greater tham the pivot are on the right
        int pi = partition(array,low,high);

        //recursive call to the left of the pivot
            quickSort(array,low,(pi-1));

        //recursive call to the right of the pivot
            quickSort(array,(pi+1),high);
        }
    }
}

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] array1 = new int[length];

        for (int i = 0; i<length;i++)
        {
            System.out.println("enter the "+(i+1)+" element of the array: ");
            array1[i]= sc.nextInt();
        }

        int size = array1.length;

        Quicksort.quickSort(array1,0,size-1);

        System.out.println("sorted array in ascending order: ");
        System.out.println(Arrays.toString(array1));
    }
}