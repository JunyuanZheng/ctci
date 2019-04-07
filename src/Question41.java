public class Question41 {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length;) {
            if (nums[i] == i + 1 || nums[i] <= 0 || nums[i] > nums.length)
                i+= 1;
            else if (nums[nums[i] - 1] != nums[i])
                swap(nums, i, nums[i] - 1);
            else
                i += 1;
        }
        int i = 0;
        while (i < nums.length && nums[i] == i + 1)
            i += 1;
        return i + 1;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
