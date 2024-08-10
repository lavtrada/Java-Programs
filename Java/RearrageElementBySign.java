
public class RearrageElementBySign {
    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > 0 && nums[i + 1] > 0) {
                int temp = nums[i + 1];
                for (int j = i + 2; j < nums.length; j++) {
                    if (nums[j] < 0) {
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                    }
                    break;
                }
            }
            if (nums[i] < 0 && nums[i + 1] < 0) {
                int temp = nums[i + 1];
                for (int j = i + 2; j < nums.length; j++) {
                    if (nums[j] > 0) {
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                    }
                    break;
                }
            }
    
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}
