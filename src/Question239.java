import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Question239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0)
            return new int[] {};
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i <= nums.length - k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < k; j += 1) {
                max = Math.max(max, nums[i + j]);
            }
            result[i] = max;
        }
        return result;
    }
}
