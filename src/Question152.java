public class Question152 {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int max = nums[0], min = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; i += 1) {
            int value = nums[i];
            int tmp = max;
            max = Math.max(Math.max(tmp * value, min * value), value);
            min = Math.min(Math.min(tmp * value, min * value), value);
            result = Math.max(max, result);
        }
        return result;
    }
}
