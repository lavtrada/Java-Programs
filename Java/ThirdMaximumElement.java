public class ThirdMaximumElement {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        System.out.println(max);
        int temp=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>temp && nums[i]<max)
            {
                temp=nums[i];
            }
        }
        System.out.println(temp);
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>secondmax && nums[i]<temp)
            {
                secondmax=nums[i];
            }
        }
        System.out.println(secondmax);
    }
}
