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
            int currentNumber = num;
            int localLength = 0;
            while (set.contains(currentNumber)) {
                currentNumber += 1;
                localLength += 1;
            }
            length = Math.max(length, localLength);
        }
        return length;
    }
}
