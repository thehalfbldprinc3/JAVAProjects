class ArrayOp
{
    public int[] N1Op(int[] nums)
    {
        for(int i=0;i<(nums.length-1);i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i] *= 2;
                nums[i+1]=0;
            }
        }
        return nums;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        ArrayOp ap= new ArrayOp();
        int[] nums={1,2,2,1,1,0};
        int[] nums2=ap.N1Op(nums);
        int temp;
        for(int i=0;i<nums2.length-1;i++)
        {
            if(nums2[i]==0&&nums2[i+1]!=nums2[i])
            {
                temp=nums2[i+1];
                nums2[i+1]=0;
                nums2[i]=temp;
            }
        }

        for(int i=0;i< nums2.length;i++)
        {
            System.out.print(nums2[i]+" ");
        }
    }
}