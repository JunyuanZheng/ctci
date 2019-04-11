public class Question238 {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; i += 1) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i -= 1) {
            result[i] = result[i] * right;
            right = nums[i] * right;
        }
        return result;
    }
}
