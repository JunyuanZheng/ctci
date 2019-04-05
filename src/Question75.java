public class Question75 {
    public void sortColors(int[] nums) {
        int zero = 0, second = nums.length - 1;
        for (int i = 0; i <= second; i += 1) {
            while (nums[i] == 2 && i <= second) {
                swap(nums, i, second);
                second -= 1;
            }
            while (nums[i] == 0 && i >= zero) {
                swap(nums, i, zero);
                zero += 1;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
