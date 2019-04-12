public class Question41 {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length;) {
            if (nums[i] == i + 1 || nums[i] <= 0 || nums[i] > nums.length)
                i += 1;
            else if (nums[nums[i] - 1] != nums[i])
                swap(nums, nums[i] - 1, i);
            else
                i += 1;
        }
        int i = 0;
        while (i < nums.length && i + 1 == nums[i])
            i += 1;
        return i + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
