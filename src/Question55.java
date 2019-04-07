public class Question55 {
    /*
    public boolean canJump(int[] nums) {
        boolean[] success = new boolean[nums.length];
        success[0] = true;
        for (int i = 0; i < nums.length;  i += 1) {
            for (int j = 0; j < i; j += 1) {
                if (success[j] && j + nums[j] >= i) {
                    success[i] = true;
                    break;
                }
            }
        }
        return success[nums.length - 1];
    }
    */

    public boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
}
