//Bubble sort in java.
import java.util.*;
public class Main
{
    //Perform bubble sort.
    static void bubbleSort(int[] array)
    {
        int size = array.length;

        //loop to access each array element.
        for(int i = 0 ; i < (size-1) ; i++)
        {

            //check if swapping occurs
            boolean swapCheck = false;

            //loop to compare adjacent elements;
            for(int j = 0 ; j< (size-i-1) ; j++)
            {
                // compare two array elements
                // change > to < to sort in descending order
                if(array[j]>array[j+1])
                {
                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                    swapCheck = true;
                }
            }

            if(!swapCheck) break;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of the array: ");
        int length=sc.nextInt();
        int[] A=new int[length];

        for(int i=0;i<length;i++)
        {
            System.out.println("enter the "+(i+1)+" entry of the array: ");
            A[i]=sc.nextInt();
        }
        Main.bubbleSort(A);

        System.out.println("Sorted array in Ascending Order: ");
        System.out.println(Arrays.toString(A));
    }
}