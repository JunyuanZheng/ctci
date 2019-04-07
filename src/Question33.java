public class Question33 {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int number;
            if (nums[mid] < nums[0] == target < nums[0]) {
                number = nums[mid];
            } else if (target < nums[0])
                number = Integer.MIN_VALUE;
            else
                number = Integer.MAX_VALUE;
            if (number < target)
                left = mid + 1;
            else if (number > target)
                right = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
