class sortArray
{
    int[] MergeArray(int[] nums1,int[] nums2)
    {
        int[] SArray=new int[nums1.length + nums2.length];
        for(int i=0;i< nums1.length;i++)
        {
            SArray[i] = nums1[i];
        }
        int controlVar =0;
        for(int i= nums1.length;i< nums1.length+nums2.length;i++)
        {
            SArray[i]=nums2[controlVar];
            controlVar++;
        }
        return SArray;
    }
}
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
        //compare each element with pivot
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
    static void quickSort(int[] array,int low,int high)
    {
        if(low <high)
        {
            //find pivot element such that
            //elements smaller than the pivot are on the left
            //elements greater than the pivot are on the right
            int pi = partition(array,low,high);

            //recursive call to the left of the pivot
            quickSort(array,low,(pi-1));

            //recursive call to the right of the pivot
            quickSort(array,(pi+1),high);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        sortArray sa =new sortArray();
        int[] nums1={1,2,3,4,5,6,24,56};
        int[] nums2={6,7,8,9,10,52,74};
        int[] nums3= sa.MergeArray(nums1,nums2);
        Quicksort.quickSort(nums3,0,nums3.length-1);
        for (int j : nums3) {
            System.out.print(j + " ");
        }
    }
}