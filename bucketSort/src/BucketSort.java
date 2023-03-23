//Bucket sort in java.
import java.util.*;
public class BucketSort
{
    public void bucketSort(int[] arr , int n)
    {
        if(n<=0)
            return;
        @SuppressWarnings("Unchecked")
        ArrayList<Float>[] bucket = new ArrayList[n];

        //create empty buckets
        for(int i=0;i<n;i++) bucket[i] = new ArrayList<Float>();

        //add elements into the buckets
        for(int i =0;i<n;i++)
        {
            int bucketIndex = (int) arr[i]*n;
            bucket[bucketIndex].add((float) arr[i]);
        }
        //sort the elements in each bucket
        for(int i =0;i<n;i++) Collections.sort((bucket[i]));

        //Get the sorted array
        int index =0;
        for(int i =0;i<n;i++) for(float j = 0, size = bucket[i].size(); j < size; j++) {
            arr[index++]=bucket[i].get(j);
        }
    }

    //Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i =0;i<length;i++)
        {
            System.out.println("enter the "+(i+1)+" entry of the array: ");
            array[i]= sc.nextInt();
        }
        BucketSort bs= new BucketSort();
        bs.bucketSort(array,length);

        for(int i:array)
            System.out.println(i+" ");
    }
}