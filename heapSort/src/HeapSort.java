import java.util.*;

//Heap sort in Java
public class HeapSort
{
    public void sort(int[] arr)
    {
        int n = arr.length;

        //Build max heap
        for(int i =n/2-1;i>=0;i--)
        {
            heapify(arr,n,i);
        }

        //Heap sort
        for(int i =n-1;i>=0;i--)
        {
            int temp =arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            //Heapify root element
            heapify(arr,i,0);
        }
    }

    void heapify(int[] arr,int n,int i)
    {
        //find the largest among root, left child and right  child
        int largest =i;
        int l=2*i+1;
        int r=2*i+2;

        if(l<n&&arr[l]>arr[largest]) largest=l;
        if(r<n&&arr[r]>arr[largest]) largest=r;

        //swap and continue heapifying root is not largest
        if(largest!=i)
        {
            int swap = arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;

            heapify(arr,n,largest);
        }
    }

    //function to print the array
    static void printArray(int[] arr)
    {
        int n =arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    //Driver Code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] arr=new int[length];
        for(int i =0;i<length;i++)
        {
            System.out.println("Enter the "+(i+1)+" element of the array");
            arr[i]= sc.nextInt();
        }

        HeapSort hs = new HeapSort();
        hs.sort(arr);

        System.out.println("sorted array is: ");
        printArray(arr);
    }
}