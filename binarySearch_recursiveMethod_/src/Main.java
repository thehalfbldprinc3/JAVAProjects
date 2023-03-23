import java.util.*;
//Binary search in Java
class BinarySearch
{
    int binarySearch (int[] array,int x ,int low ,int high)
    {
        if(high>=low)
        {
            int mid = low + (high-low)/2;

            //if found at mid, then return it
            if(array[mid]==x) return mid;

            //search the left hand
            if(array[mid]>x) return binarySearch(array,x,low,(mid-1));

            //search the right hand
            return binarySearch(array,x,mid+1,high);
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array: ");
        int length = sc.nextInt();
        int[] array =new int[length];
        for(int i=0;i<length;i++)
        {
            System.out.println("enter the "+(i+1)+" element of the array: ");
            array[i]= sc.nextInt();
        }
        System.out.println("enter the search query: ");
        int searchQ = sc.nextInt();
    }
}