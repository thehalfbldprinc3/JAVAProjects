import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of the array");
        int num= sc.nextInt();
        int[] arr=new int[num];

        for(int i=0;i<num;i++)
        {
            System.out.println("enter the "+(i+1)+" element of the array: ");
            arr[i]= sc.nextInt();
        }

        System.out.println("enter the element to be removed: ");
        int RElement= sc.nextInt();
        for(int i=0;i<num;i++)
        {
            if(arr[i]==RElement) arr[i]=0;
        }

            System.out.print("{");
        for (int i=0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }
            System.out.print("}");
    }
}