public class AscendingOrderButZerosAtLast {
    public static void main(String[] args)
    {
        int[] nums={1,2,0,3,0,5};
        if (nums.length == 1) {
            return;
        }

        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) { 
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

       
         while(nonZeroIndex<nums.length){
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    }
}
