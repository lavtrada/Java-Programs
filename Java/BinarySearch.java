public class BinarySearch{
    public static void main(String[] args)
    {
        int[] nums={1,2,3,45,50,80,90};
        int target=2;
        
        int left=0;
        int right=nums.length;
        int half=(left+right)/2;
            while(nums[half]!=target)
            {
                if(target>nums[half])
                {
                    left=half;
                    half=(left+right)/2;

                }
                if(target<nums[half])
                {
                    right=half;
                    half=(left+right)/2;
                }                
            }
            System.out.println(half);
        
    }
}
// class Solution {
//     public int search(int[] nums, int target) {
//         int left = 0;
//         int right = nums.length - 1; // Use nums.length - 1 to handle bounds properly.

//         while (left <= right) {
//             int mid = left + (right - left) / 2; // Prevent potential overflow.

//             if (nums[mid] == target) {
//                 return mid; // Target found.
//             } else if (nums[mid] < target) {
//                 left = mid + 1; // Narrow the search range to the right.
//             } else {
//                 right = mid - 1; // Narrow the search range to the left.
//             }
//         }

//         return -1; // Target not found.
//     }
// }
