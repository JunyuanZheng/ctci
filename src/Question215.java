public class Question215 {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;
        return quicksort(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quicksort(int[] nums, int start, int end, int k) {
        if (start > end)
            return Integer.MAX_VALUE;
        int pivot = nums[end];
        int left = start;
        for (int i = start; i < end; i += 1) {
            if (nums[i] <= pivot) {
                swap(nums, i, left);
                left += 1;
            }
        }
        swap(nums, left, end);
        if (left == k)
            return nums[left];
        else if (left < k)
            return quicksort(nums, left + 1, end, k);
        else
            return quicksort(nums, start, left - 1, k);
    }

    private void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}
