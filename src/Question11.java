public class Question11 {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0)
            return 0;
        int result = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            result = Math.max(result, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left += 1;
            } else {
                right -= 1;
            }
        }
        return result;
    }
}
