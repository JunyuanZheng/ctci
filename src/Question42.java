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
        if (height == null || height.length == 0)
            return 0;
        int left = 0;
        int right = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        int result = 0;
        while (left <= right) {
            maxLeft = Math.max(maxLeft, height[left]);
            maxRight = Math.max(maxRight, height[right]);
            if (maxLeft < maxRight) {
                result += (maxLeft - height[left]);
                left += 1;
            } else {
                result += (maxRight - height[right]);
                right -= 1;
            }
        }
        return result;
    }
}
