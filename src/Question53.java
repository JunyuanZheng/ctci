public class Question53 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int maxprev = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i += 1) {
            int num = nums[i];
            maxprev = Math.max(num, maxprev + num);
            max = Math.max(maxprev, max);
        }
        return max;
    }
}