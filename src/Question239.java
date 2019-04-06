import java.util.ArrayDeque;
import java.util.Deque;

public class Question239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0)
            return new int[] {};
        int size = nums.length;
        int[] result = new int[size - k + 1];
        int ri = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i += 1) {
            while (!deque.isEmpty() && deque.peek() < i - k + 1)
                deque.poll();
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
                deque.pollLast();
            deque.offer(i);
            if (i >= k - 1) {
                result[ri++] = nums[deque.peek()];
            }
        }
        return result;
    }
}
