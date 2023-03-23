import java.util.*;

//Linear search in Java
class LinearSearch
{
    public static int linearSearch(int[] array,int x)
    {
        int n= array.length;

        //Going through array sequentially
        for(int i =0;i<n;i++)
        {
            if(array[i]==x) return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] array= new int[length];
        for(int i=0;i<length;i++)
        {
            System.out.println("enter the "+(i+1)+" entry of the array: ");
            array[i]= sc.nextInt();
        }
        System.out.println("enter the element to be searched: ");
        int searchQuary = sc.nextInt();

        int result = linearSearch(array,searchQuary);

        if(result==-1) System.out.println("element not found");
        else System.out.println("element found at index: "+(result+1));
    }
}