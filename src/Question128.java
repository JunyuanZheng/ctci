import java.util.HashSet;
import java.util.Set;

public class Question128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        int length = 0;
        for (int num : nums) {
            if (set.contains(num - 1))
                continue;
            int value = num;
            while (set.contains(value))
                value += 1;
            length = Math.max(length, value - num);
        }
        return length;
    }
}
