import java.util.*;
//Binary Search in Java
class BinarySearch
{
    int binarySearch(int[] array,int x,int low,int high)
    {
        //Repeat until the pointer low and high meet each other
        while(low<=high)
        {
            int mid=low + (high-low)/2;

            if(array[mid]==x) return mid;
            if(array[mid]<x) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        BinarySearch bs= new BinarySearch();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of the array: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.print("enter the number to be searched: ");
        int searchQ= sc.nextInt();
        for(int i =0;i<length;i++)
        {
            System.out.print("enter the "+(i+1)+" entry of the array: ");
            array[i]= sc.nextInt();
        }
        int result = bs.binarySearch(array,searchQ,(0),(length-1));

        if(result==-1) System.out.println("Not Found!");
        else System.out.println("element found at "+(result+1));
    }
}