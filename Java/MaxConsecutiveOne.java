class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
       int max=0;
       int count=0;
       for(int i=0;i<nums.length;i++)
       {
        for(int j=0;j<nums.length;j++)
        {
            if(nums[i]==1)
            {
                if(nums[j]==1) count++;
                else break;
            }
            if(count>max)
            {
                max=count;
            }
        }

       } 
       return max;
    }
}