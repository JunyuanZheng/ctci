public class Question42 {
    /*
    public int trap(int[] height) {
        if (height == null || height.length == 0)
            return 0;
        int[] lMax = new int[height.length];
        int[] rMax = new int[height.length];

        int leftMax = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i += 1) {
            leftMax = Math.max(leftMax, height[i]);
            lMax[i] = leftMax;
        }

        int rightMax = Integer.MIN_VALUE;
        for (int i = height.length - 1; i >= 0; i -= 1) {
            rightMax = Math.max(rightMax, height[i]);
            rMax[i] = rightMax;
        }

        int result = 0;
        for (int i = 0; i < height.length; i += 1) {
            result += Math.min(lMax[i], rMax[i]) - height[i];
        }

        return result;
    }
    */

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        int leftmax = 0;
        int rightmax = 0;
        while (left <= right) {
            leftmax = Math.max(leftmax, height[left]);
            rightmax = Math.max(rightmax, height[right]);
            if (leftmax < rightmax) {
                max += (leftmax - height[left]);
                left++;
            } else {
                max += (rightmax - height[right]);
                right--;
            }
        }
        return max;
    }
}
