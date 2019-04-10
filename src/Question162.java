public class Question162 {
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid + 1] < nums[mid])
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }
}
