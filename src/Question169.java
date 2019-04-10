import java.util.Arrays;

public class Question169 {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
