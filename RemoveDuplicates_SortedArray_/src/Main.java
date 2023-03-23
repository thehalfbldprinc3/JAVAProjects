public class Main
{
    public static int[] removeDuplicate(int[] nums)
    {
        int[] arr=new int[nums.length];
        arr[0]=nums[0];
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1]&&nums[i]!=nums[i-1])
            {
                arr[i]=nums[i];
            }
        }
    return arr;
    }
    public static void main(String[] args)
    {
        int[] nums={1,1,2,2,2,3,3,5,5,5,5};
        int[] arr2=removeDuplicate(nums);
        System.out.print("{ ");
        for(int i =0;i<arr2.length;i++)
        {
            System.out.print(+arr2[i]+" ");
        }
        System.out.print(" }");
    }
}