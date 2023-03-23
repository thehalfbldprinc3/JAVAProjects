//Selection sort in java
import java.util.*;
class SelectionSort
{
    void selectionSort(int[] array)
    {
        int size = array.length;

        for(int step = 0 ; step < (size - 1) ; step++)
        {
            int minIdx = step;

            for(int i = (step + 1) ; i < size ; i++)
            {
                //to sort in descending order, change > to < in this line.
                //select the minimum element in each loop.
                if(array[i]<array[minIdx])
                {
                    minIdx=i;

                }
            }
            //put min at the correct position
            int temp=array[step];
            array[step]=array[minIdx];
            array[minIdx]=temp;
        }
    }


    //driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] A= new int[length];

        for(int i = 0 ; i < length ; i++)
        {
            System.out.println("enter the "+(i+1)+" element of the array: ");
            A[i]= sc.nextInt();
        }

        SelectionSort ss = new SelectionSort();
        ss.selectionSort(A);

        System.out.println("sorted array in ascending order: ");
        System.out.println(Arrays.toString(A));
    }
}