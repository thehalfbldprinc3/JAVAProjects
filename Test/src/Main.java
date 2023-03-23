import java.util.Arrays;

public class Main {
    static int[] insertionSort(int[] arr)
        {
            int key;
            for(int i=2;i< arr.length;i++)
            {
                key=arr[i];
                int j=i-1;
                while(j>0&&arr[j]>key)
                {
                    arr[j+1]=arr[j];
                    j=j-1;

                }
                arr[j+1]=key;
            }
        return arr;
        }

    public static void main(String[] args)
    {
        int[] array ={2,7,5,9,3,4,6};
        insertionSort(array);
        System.out.print(Arrays.toString(array));
    }
}