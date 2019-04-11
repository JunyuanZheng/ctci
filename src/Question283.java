public class Question283 {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int idx = 0;
        for (int i = 0; i < nums.length; i += 1) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = 0;
                nums[idx] = tmp;
                idx += 1;
            }
        }
    }
}
