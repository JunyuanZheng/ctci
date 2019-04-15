import java.util.Arrays;

public class Question300 {
    /*
    public int lengthOfLIS(int[] nums) {
        return helper(nums, Integer.MIN_VALUE, 0);
    }

    private int helper(int[] nums, int pre, int i) {
        if (i >= nums.length)
            return 0;
        int take = 0;
        if (nums[i] > pre)
            take = 1 + helper(nums, nums[i], i + 1);
        int notake = helper(nums, pre, i + 1);
        return Math.max(take, notake);
    }
    */

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int max = 0;
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i += 1) {
            int result = 0;
            for (int j = 0; j < i; j += 1) {
                if (nums[i] >= nums[j])
                    result = Math.max(result, dp[j]);
            }
            dp[i] = result + 1;
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
